package org.wang.mall.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.wang.mall.command.MerchantCommand;
import org.wang.mall.model.Merchant;
import org.wang.mall.service.MerchantService;
import org.wang.mall.util.LoginForm;
import org.wang.mall.util.Parameter;


/**
 * Created by ozintel06 on 16/8/3.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  08/07/2016 22:19
 */

@Controller
@RequestMapping(value = "/merchant")
public class MerchantController {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private MerchantService merchantService;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * createConsumer.
   *
   * @param   command  MerchantCommand
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/create",
    method = RequestMethod.POST
  )
  public String createMerchant(MerchantCommand command) {
    Merchant merchant = command.toMerchant(command);
    merchantService.save(merchant);

    return "redirect:/consumer/create?create=Y";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * login.
   *
   * @param   request    HttpServletRequest
   * @param   loginForm  LoginForm
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/login",
    method = RequestMethod.POST
  )
  public String login(HttpServletRequest request, LoginForm loginForm) {
    Merchant merchant = merchantService.findByNameAndPassWord(loginForm.getName(), loginForm.getPassword());

    if (merchant != null) {
      request.getSession().setAttribute(Parameter.USER_NAME_KEY, merchant.getName());
      request.getSession().setAttribute(Parameter.USER_ID_KEY, merchant.getId());
      request.getSession().setAttribute(Parameter.USER_ROLE_KEY, "merchant");

      return "redirect:/merchant/index";
    }

    return "redirect:/login?failed=true";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toCreateConsumerView.
   *
   * @param   request  HttpServletRequest
   * @param   model    Model
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/create",
    method = RequestMethod.GET
  )
  public String toCreateMerchantView(HttpServletRequest request, Model model) {
    MerchantCommand command = new MerchantCommand();

    if ((request.getParameter("create") != null) && request.getParameter("create").equals("Y")) {
      command.setCreate("Y");
      model.addAttribute("command", command);

      return "/consumer/create";
    }

    model.addAttribute("command", command);

    return "/merchant/create";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toInfoView.
   *
   * @param   request  HttpServletRequest
   * @param   model    Model
   * @param   id       Long
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/info",
    method = RequestMethod.GET
  )
  public String toInfoView(HttpServletRequest request, Model model, Long id) {
    Merchant        merchant = merchantService.findOne(id);
    MerchantCommand command  = new MerchantCommand(merchant);


    model.addAttribute("command", command);

    return "/merchant/info";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toMerchantIndexView.
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/index",
    method = RequestMethod.GET
  )
  public String toMerchantIndexView() {
    return "/merchant/index";
  }
} // end class MerchantController
