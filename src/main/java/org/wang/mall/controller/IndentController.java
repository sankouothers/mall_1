package org.wang.mall.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.wang.mall.command.AllIndentCommand;
import org.wang.mall.command.IndentCommand;
import org.wang.mall.command.ShoppingCarCommand;
import org.wang.mall.model.Address;
import org.wang.mall.model.Commodity;
import org.wang.mall.model.Consumer;
import org.wang.mall.model.Indent;
import org.wang.mall.model.Merchant;
import org.wang.mall.service.AddressService;
import org.wang.mall.service.CommodityService;
import org.wang.mall.service.ConsumerService;
import org.wang.mall.service.IndentService;
import org.wang.mall.service.MerchantService;
import org.wang.mall.util.Parameter;


/**
 * Created by ozintel06 on 16/8/30.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  09/04/2016 04:16
 */

@Controller
@RequestMapping(value = "/indent")
public class IndentController {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  /** TODO: DOCUMENT ME! */
  @Autowired AddressService addressService;

  /** TODO: DOCUMENT ME! */
  @Autowired CommodityService commodityService;

  /** TODO: DOCUMENT ME! */
  @Autowired ConsumerService consumerService;

  /** TODO: DOCUMENT ME! */
  @Autowired IndentService   indentService;

  /** TODO: DOCUMENT ME! */
  @Autowired MerchantService merchantService;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * addIndent.
   *
   * @param   request  HttpServletRequest
   * @param   id       Long
   * @param   model    Model
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/create",
    method = RequestMethod.GET
  )
  public String addIndent(HttpServletRequest request, Long id, Model model) {
    if (id != null) {
      Long     userId   = (Long) request.getSession().getAttribute(Parameter.USER_ID_KEY);
      Consumer consumer = new Consumer();
      consumer.setId(userId);

      Commodity commodity = commodityService.findOne(id);

      Indent indent = new Indent();

      indent.setCreateDate(new Date());
      indent.setCommodity(commodity);
      indent.setConsumer(consumer);
      indent.setConfirm(false);
      indent.setPickup(false);
      indent.setShipping(false);

      indentService.save(indent);
    }

    return "redirect:/indent/addIndentSuccess";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * buy.
   *
   * @param   model          Model
   * @param   indentCommand  IndentCommand
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/buy",
    method = RequestMethod.POST
  )
  public String buy(Model model, IndentCommand indentCommand) {
    Indent indent = indentCommand.toIndent(indentCommand);
    indentService.save(indent);

    return "redirect:/indent/buySuccess";
  }

  //~ ------------------------------------------------------------------------------------------------------------------


  /**
   * pickup.
   *
   * @param   request  HttpServletRequest
   * @param   model    Model
   * @param   id       Long
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/pickup",
    method = RequestMethod.GET
  )
  public String pickup(HttpServletRequest request, Model model, Long id) {
    Indent indent = indentService.findOne(id);
    indent.setShipping(true);
    indentService.save(indent);

    return "redirect:/indent/process?id=" + indent.getMerchant().getId();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toShoppingCartView.
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/addIndentSuccess",
    method = RequestMethod.GET
  )
  public String toAddIndentSuccessView() {
    return "indent/addIndentSuccess";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toBuySuccessView.
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/buySuccess",
    method = RequestMethod.GET
  )
  public String toBuySuccessView() {
    return "indent/buySuccess";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toBuyView.
   *
   * @param   request  HttpServletRequest
   * @param   model    Model
   * @param   id       Long
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/buy",
    method = RequestMethod.GET
  )
  public String toBuyView(HttpServletRequest request, Model model, Long id) {
    String createAddress = request.getParameter("createAddress");

    Indent        indent      = indentService.findOne(id);
    Consumer      consumer    = indent.getConsumer();
    List<Address> addressList = addressService.finByConsumer(consumer);

    IndentCommand indentCommand = new IndentCommand();
    indentCommand.toBuy(indent, addressList);

    if (createAddress != null) {
      indentCommand.setCreateAddress(createAddress);
    }

    model.addAttribute("command", indentCommand);

    return "indent/buy";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toIndentListView.
   *
   * @param   request  HttpServletRequest
   * @param   model    Model
   * @param   id       Long
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/allIndent",
    method = RequestMethod.GET
  )
  public String toIndentListView(HttpServletRequest request, Model model, Long id) {
    AllIndentCommand    allIndentCommand  = new AllIndentCommand();
    Consumer            consumer          = consumerService.findOne(id);
    List<Indent>        indentList        = indentService.findByIsConfirmAndConsumer(true, consumer);
    List<IndentCommand> indentCommandList = new ArrayList<IndentCommand>();

    if (indentList != null) {
      for (Indent indent : indentList) {
        IndentCommand indentCommand = new IndentCommand();
        indentCommand.toAllIndent(indent);
        indentCommandList.add(indentCommand);
      }

      allIndentCommand.setIndentCommandList(indentCommandList);
      allIndentCommand.setNotIndent("false");
    } else {
      allIndentCommand.setNotIndent("true");
    }

    model.addAttribute("command", allIndentCommand);

    return "indent/allIndent";
  }

  //~ ------------------------------------------------------------------------------------------------------------------


  /**
   * toProcessView.
   *
   * @param   request  HttpServletRequest
   * @param   model    Model
   * @param   id       Long
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/process",
    method = RequestMethod.GET
  )
  public String toProcessView(HttpServletRequest request, Model model, Long id) {
    Merchant            merchant          = merchantService.findOne(id);
    List<Indent>        indentList        = indentService.findByIsConfirmAndMerchant(true, merchant);
    List<IndentCommand> indentCommandList = new ArrayList<IndentCommand>();

    for (Indent indent : indentList) {
      IndentCommand indentCommand = new IndentCommand();
      indentCommand.toMerchantIndent(indent);
      indentCommandList.add(indentCommand);
    }

    ShoppingCarCommand shoppingCarCommand = new ShoppingCarCommand();

    if (indentCommandList.size() == 0) {
      shoppingCarCommand.setNotIndent("true");

      return "indent/processIndent";
    }

    shoppingCarCommand.setNotIndent("false");
    shoppingCarCommand.setIndentCommandList(indentCommandList);

    model.addAttribute("command", shoppingCarCommand);

    return "indent/processIndent";
  } // end method toProcessView

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toShoppingCartView.
   *
   * @param   request  HttpServletRequest
   * @param   model    Model
   * @param   id       Long
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/shoppingCart",
    method = RequestMethod.GET
  )
  public String toShoppingCartView(HttpServletRequest request, Model model, Long id) {
    Consumer            consumer           = consumerService.findOne(id);
    ShoppingCarCommand  shoppingCarCommand = new ShoppingCarCommand();
    List<IndentCommand> indentCommandList  = new ArrayList<IndentCommand>();
    List<Indent>        indentList         = indentService.findByIsConfirmAndConsumer(false, consumer);

    if (indentList != null) {
      for (Indent indent : indentList) {
        IndentCommand indentCommand = new IndentCommand();
        indentCommand.toShoppingCart(indent);
        indentCommandList.add(indentCommand);
      }

      shoppingCarCommand.setIndentCommandList(indentCommandList);
      shoppingCarCommand.setNotIndent("false");
    } else {
      shoppingCarCommand.setNotIndent("true");
    }

    model.addAttribute("command", shoppingCarCommand);

    return "indent/shoppingCart";
  }

} // end class IndentController
