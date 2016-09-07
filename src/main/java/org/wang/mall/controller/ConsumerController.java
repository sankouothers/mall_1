package org.wang.mall.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.wang.mall.command.ConsumerCommand;
import org.wang.mall.model.Consumer;
import org.wang.mall.service.ConsumerService;


/**
 * Created by ozintel06 on 16/8/7.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  08/07/2016 22:19
 */
@Controller
@RequestMapping(value = "/consumer")
public class ConsumerController {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private ConsumerService consumerService;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * createConsumer.
   *
   * @param   command  ConsumerCommand
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
   * edit.
   *
   * @param   request  HttpServletRequest
   * @param   model    Model
   * @param   id       Long
   * @param   command  ConsumerCommand
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/edit",
    method = RequestMethod.POST
  )
  public String edit(HttpServletRequest request, Model model, Long id, ConsumerCommand command) {
    Consumer consumer     = consumerService.findOne(command.getId());
    Consumer editConsumer = command.edit(consumer, command);

    consumerService.save(editConsumer);

    return "redirect:/consumer/editSuccess";
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
  public String toCreateConsumerView(HttpServletRequest request, Model model) {
    ConsumerCommand command = new ConsumerCommand();

    if ((request.getParameter("create") != null) && request.getParameter("create").equals("Y")) {
      command.setCreate("Y");
      model.addAttribute("command", command);

      return "/consumer/create";
    }

    model.addAttribute("command", command);

    return "/consumer/create";
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
    Consumer        consumer = consumerService.findOne(id);
    ConsumerCommand command  = new ConsumerCommand(consumer);
    model.addAttribute("command", command);

    return "/consumer/info";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toUpdateView.
   *
   * @param   request  HttpServletRequest
   * @param   model    Model
   * @param   id       Long
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/edit",
    method = RequestMethod.GET
  )
  public String toUpdateView(HttpServletRequest request, Model model, Long id) {
    Consumer        consumer = consumerService.findOne(id);
    ConsumerCommand command  = new ConsumerCommand(consumer);
    model.addAttribute("command", command);

    return "/consumer/edit";
  }
} // end class ConsumerController
