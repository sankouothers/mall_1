package org.wang.mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.wang.mall.command.ConsumerCommand;
import org.wang.mall.model.Consumer;
import org.wang.mall.service.ConsumerService;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by ozintel06 on 16/8/7.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  08/07/2016 22:19
 */
@Controller
@RequestMapping(value = "/consumer")
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;
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
  public String createConsumer(ConsumerCommand command) {
     Consumer consumer = command.toConsumer(command);
      consumerService.save(consumer);
    return "redirect:/consumer/create?create=Y";
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
  public String toCreateConsumerView(HttpServletRequest request,Model model) {
      ConsumerCommand command = new ConsumerCommand();
      if (request.getParameter("create") != null && request.getParameter("create").equals("Y")) {
          command.setCreate("Y");
          model.addAttribute("command",command);
          return "/consumer/create";
      }
      model.addAttribute("command",command);
    return "/consumer/create";
  }
} // end class ConsumerController
