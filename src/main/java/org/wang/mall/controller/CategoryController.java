package org.wang.mall.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.wang.mall.model.Commodity;


/**
 * Created by ozintel06 on 16/8/18.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  08/18/2016 16:15
 */
@Controller
@RequestMapping(value = "/category")
public class CategoryController {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * commodityListBySales.
   *
   * @param   request  HttpServletRequest
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/categoryList",
    method = RequestMethod.GET
  )
  public String commodityListBySales(HttpServletRequest request) {
    return "category/categoryList";
  }

}
