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

import org.wang.mall.command.IndentCommand;
import org.wang.mall.command.ShoppingCarCommand;
import org.wang.mall.model.Address;
import org.wang.mall.model.Commodity;
import org.wang.mall.model.Consumer;
import org.wang.mall.model.Indent;
import org.wang.mall.service.AddressService;
import org.wang.mall.service.CommodityService;
import org.wang.mall.service.ConsumerService;
import org.wang.mall.service.IndentService;
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
  @Autowired IndentService indentService;

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
      indent.setConfirm(true);
      indent.setPickup(true);
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
   * @param   model  Model
   * @param   id     Long
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/buy",
    method = RequestMethod.GET
  )
  public String toBuyView(Model model, Long id) {
    Indent        indent      = indentService.findOne(id);
    Consumer      consumer    = indent.getConsumer();
    List<Address> addressList = addressService.finByConsumer(consumer);

    IndentCommand indentCommand = new IndentCommand();
    indentCommand.toBuy(indent, addressList);

    model.addAttribute("command", indentCommand);

    return "indent/buy";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toShoppingCartView.
   *
   * @param   request  HttpServletRequest
   * @param   model    Model
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/shoppingCart",
    method = RequestMethod.GET
  )
  public String toShoppingCartView(HttpServletRequest request, Model model) {
    ShoppingCarCommand  shoppingCarCommand = new ShoppingCarCommand();
    List<IndentCommand> indentCommandList  = new ArrayList<IndentCommand>();
    List<Indent>        indentList         = indentService.findByIsConfirm(false);

    if (indentList != null) {
      for (Indent indent : indentList) {
        IndentCommand indentCommand = new IndentCommand();
        indentCommand.toShoppingCart(indent);
        indentCommandList.add(indentCommand);
      }

      shoppingCarCommand.setIndentCommandList(indentCommandList);
      shoppingCarCommand.setNotIndent("false");
      model.addAttribute("command", shoppingCarCommand);

      return "indent/shoppingCart";
    }

    shoppingCarCommand.setNotIndent("true");

    return "indent/shoppingCart";
  }

} // end class IndentController
