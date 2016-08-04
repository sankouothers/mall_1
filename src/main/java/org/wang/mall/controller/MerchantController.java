package org.wang.mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.wang.mall.model.Merchant;
import org.wang.mall.service.MerchantService;
import org.wang.mall.util.LoginForm;

/**
 * Created by ozintel06 on 16/8/3.
 */

@Controller
@RequestMapping(value  = "/merchant")
public class MerchantController {

    @Autowired
    private MerchantService merchantService;


    @RequestMapping(
            value = "/index",
            method = RequestMethod.GET
    )
    public String index(){
        return "/merchant/index";
    }

    @RequestMapping(
            value = "/login",
            method = RequestMethod.POST
    )
    public String login(LoginForm loginForm){
        Merchant merchant = merchantService.findByNameAndPassWord(loginForm.getName(),loginForm.getPassword());

        if ( merchant != null) {
            return "redirect:/merchant/index";
        }
        return "redirect:/login?failed=true";
    }
}
