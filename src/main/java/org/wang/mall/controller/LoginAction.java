package org.wang.mall.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 * Created by Yang Wang on 8/15/15.
 *
 * @author   $author$
 * @version  $Revision$, $Date$
 */
@Controller public class LoginAction {

    @RequestMapping(
            value  = "/login",
            method = RequestMethod.GET
    )
    public String toLoginView() {
        return "login";
    }

}
