package org.wang.mall.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.wang.mall.model.Consumer;
import org.wang.mall.model.Merchant;
import org.wang.mall.service.ConsumerService;
import org.wang.mall.service.MerchantService;
import org.wang.mall.util.LoginForm;


/**
 * Created by Yang Wang on 8/15/15.
 *
 * @author   $author$
 * @version  $Revision$, $Date$
 */
@Controller public class LoginAction {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private ConsumerService consumerService;

  //~ Methods ----------------------------------------------------------------------------------------------------------

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
    Consumer consumer = consumerService.findByNameAndPassWord(loginForm.getName(), loginForm.getPassword());

    if (consumer != null) {
      return "redirect:/mall";
    }

    return "redirect:/login?failed=true";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toLoginView.
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/login",
    method = RequestMethod.GET
  )
  public String toLoginView() {
    return "login";
  }

} // end class LoginAction
