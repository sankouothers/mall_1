package org.wang.mall.controller;

import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.wang.mall.command.PasswordCommand;
import org.wang.mall.model.Commodity;
import org.wang.mall.model.Consumer;
import org.wang.mall.model.Merchant;
import org.wang.mall.service.CommodityService;
import org.wang.mall.service.ConsumerService;
import org.wang.mall.service.MerchantService;


/**
 * Created by ozintel06 on 16/8/3.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  08/12/2016 00:07
 */
@Controller public class MallController {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private CommodityService commodityService;

  @Autowired private ConsumerService consumerService;
  @Autowired private MerchantService merchantService;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * EditPassword.
   *
   * @param   request  HttpServletRequest
   * @param   command  PasswordCommand
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/editPassword",
    method = RequestMethod.POST
  )
  public String EditPassword(HttpServletRequest request, PasswordCommand command) {
    if (command.getRole().equals("consumer")) {
      Consumer consumer = consumerService.findOne(command.getId());

      if (consumer != null) {
        if (command.getPage().equalsIgnoreCase("forgot")) {
          consumer.setPassWord(command.getNewPassWord());
          consumerService.save(consumer);

          return "redirect:/editPasswordSuccess";
        }

        if (command.getPage().equalsIgnoreCase("edit")) {
          if (command.getPassWord().equals(consumer.getPassWord())) {
            consumer.setPassWord(command.getNewPassWord());
            consumerService.save(consumer);

            return "redirect:/editPasswordSuccess";
          } else {
            return "redirect:/editPassword?page=edit&id=" + command.getId() + "&role=" + command.getRole();
          }
        }

      }
    }

    if (command.getRole().equals("merchant")) {
      Merchant merchant = merchantService.findOne(command.getId());

      if (merchant != null) {
        if (command.getRole().equals("forgot")) {
          merchant.setPassWord(command.getNewPassWord());
          merchantService.save(merchant);

          return "redirect:/editPasswordSuccess";
        }

        if (command.getPage().equalsIgnoreCase("edit")) {
          if (command.getPassWord().equals(merchant.getPassWord())) {
            merchant.setPassWord(command.getNewPassWord());
            merchantService.save(merchant);

            return "redirect:/editPasswordSuccess";
          } else {
            return "redirect:/editPassword?page=edit&id=" + command.getId() + "&role=" + command.getRole();
          }
        }
      }
    }

    return "redirect:/editPasswordSuccess";
  } // end method EditPassword

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * ForgotPassword.
   *
   * @param   request  HttpServletRequest
   * @param   command  PasswordCommand
   * @param   model    Model
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/forgotPassword",
    method = RequestMethod.POST
  )
  public String ForgotPassword(HttpServletRequest request, PasswordCommand command, Model model) {
    if (command.getRole().equals("consumer")) {
      Consumer consumer = consumerService.findOne(command.getId());

      if (consumer.getName().equals(command.getName())
            && consumer.getQuestion().equals(command.getQuestion())
            && consumer.getAnswer().equals(command.getAnswer())) {
        return "redirect:/editPassword?page=forgot&id=" + command.getId() + "&role=" + command.getRole();
      }
    }

    if (command.getRole().equals("merchant")) {
      Merchant merchant = merchantService.findOne(command.getId());

      if (merchant.getName().equals(command.getName())
            && merchant.getQuestion().equals(command.getQuestion())
            && merchant.getAnswer().equals(command.getAnswer())) {
        return "redirect:/editPassword?page=forgot&id=" + command.getId() + "&role=" + command.getRole();
      }
    }

    command.setRequestError("Y");

    return "redirect:/forgotPassword";
  } // end method ForgotPassword

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toEditPasswordSuccessView.
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/editPasswordSuccess",
    method = RequestMethod.GET
  )
  public String toEditPasswordSuccessView() {
    return "editPasswordSuccess";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toEditPasswordView.
   *
   * @param   request  HttpServletRequest
   * @param   command  PasswordCommand
   * @param   model    Model
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/editPassword",
    method = RequestMethod.GET
  )
  public String toEditPasswordView(HttpServletRequest request, PasswordCommand command, Model model) {
    if (command.getRole().equals("consumer")) {
      Consumer consumer = consumerService.findOne(command.getId());

      if (consumer != null) {
        command.setName(consumer.getName());
        model.addAttribute("command", command);

        return "/editPassword";
      }
    }

    if (command.getRole().equals("merchant")) {
      Merchant merchant = merchantService.findOne(command.getId());

      if (merchant != null) {
        command.setName(merchant.getName());
        model.addAttribute("command", command);

        return "/editPassword";
      }
    }

    model.addAttribute("command", command);

    return "/editPassword";
  } // end method toEditPasswordView

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toForgotPasswordView.
   *
   * @param   request  HttpServletRequest
   * @param   command  PasswordCommand
   * @param   model    Model
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/forgotPassword",
    method = RequestMethod.GET
  )
  public String toForgotPasswordView(HttpServletRequest request, PasswordCommand command, Model model) {
    if (command.getRole().equals("consumer")) {
      Consumer consumer = consumerService.findByName(command.getName());

      if (consumer != null) {
        model.addAttribute("command", command.toForgotPassWord(consumer));

        return "forgotPassword";
      }

      command.setNoUser("Y");
      model.addAttribute("command", command);

      return "forgotPassword";
    }

    if (command.getRole().equals("merchant")) {
      Merchant merchant = merchantService.findByName(command.getName());

      if (merchant != null) {
        model.addAttribute("command", command.toForgotPassWord(merchant));

        return "forgotPassword";
      }

      command.setNoUser("Y");
      model.addAttribute("command", command);

      return "forgotPassword";
    }

    command.setRequestError("Y");
    model.addAttribute("command", command);

    return "forgotPassword";
  } // end method toForgotPasswordView

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toLoginView.
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/mall",
    method = RequestMethod.GET
  )
  public String toLoginView() {
    return "mall";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toSearchWinView.
   *
   * @param   request  HttpServletRequest
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/search",
    method = RequestMethod.GET
  )
  public String toSearchWinView(HttpServletRequest request) {
    List<Commodity> commodityList = commodityService.findAll();

    request.setAttribute("commodityList", commodityList);

    return "commodity/commodityList";
  }

} // end class MallController
