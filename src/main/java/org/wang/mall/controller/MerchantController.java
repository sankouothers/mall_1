package org.wang.mall.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.wang.mall.command.MerchantCommand;
import org.wang.mall.model.Merchant;
import org.wang.mall.service.MerchantService;
import org.wang.mall.util.LoginForm;


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
   * @return  String
   */
  @RequestMapping(
    value  = "/create",
    method = RequestMethod.POST
  )
  public String createMerchant(MerchantCommand command) {
     Merchant merchant = command.toMerchant(command);
      merchantService.save(merchant);
    return "redirect:/login";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * login.
   *
   * @param   loginForm  LoginForm
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/login",
    method = RequestMethod.POST
  )
  public String login(LoginForm loginForm) {
    Merchant merchant = merchantService.findByNameAndPassWord(loginForm.getName(), loginForm.getPassword());

    if (merchant != null) {
      return "redirect:/merchant/index";
    }

    return "redirect:/login?failed=true";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toCreateConsumerView.
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/create",
    method = RequestMethod.GET
  )
  public String toCreateMerchantView(Model model) {
      MerchantCommand command = new MerchantCommand();
      model.addAttribute("command",command);
    return "/merchant/create";
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
