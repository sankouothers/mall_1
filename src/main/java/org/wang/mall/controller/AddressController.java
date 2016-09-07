package org.wang.mall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.wang.mall.command.AddressCommand;
import org.wang.mall.model.Address;
import org.wang.mall.service.AddressService;


/**
 * Created by ozintel06 on 16/9/5.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  09/07/2016 16:57
 */

@Controller
@RequestMapping(value = "/address")
public class AddressController {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  /** TODO: DOCUMENT ME! */
  @Autowired AddressService addressService;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * buy.
   *
   * @param   addressCommand  AddressCommand
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/create",
    method = RequestMethod.POST
  )
  public String buy(AddressCommand addressCommand) {
    Address address = addressCommand.toAddress(addressCommand);

    if (address.isDefaultAddress()) {
      addressService.setIsDefaultAddress(false, address.getConsumer());
    }

    addressService.save(address);

    return "redirect:/indent/buy?id=" + addressCommand.getIndentId() + "&createAddress=true";
  }
} // end class AddressController
