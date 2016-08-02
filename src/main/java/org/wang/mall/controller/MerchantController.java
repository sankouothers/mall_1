package org.wang.mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ozintel06 on 16/8/3.
 */

@Controller
@RequestMapping(value  = "/merchant")
public class MerchantController {
    @RequestMapping(
            value = "/index",
            method = RequestMethod.GET
    )
    public String index(){
        return "merchant/index";
    }
}
