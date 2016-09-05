package org.wang.mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.wang.mall.command.AddressCommand;
import org.wang.mall.model.Address;
import org.wang.mall.service.AddressService;

import java.util.List;

/**
 * Created by ozintel06 on 16/9/5.
 */

@Controller
@RequestMapping(value = "/address")
public class AddressController {

  @Autowired
  AddressService addressService;

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
    return "redirect:/indent/buy?id="+addressCommand.getIndentId()+"&createAddress=true";
  }
}
