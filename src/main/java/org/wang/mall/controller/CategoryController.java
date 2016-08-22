package org.wang.mall.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.wang.mall.model.Category;
import org.wang.mall.model.Commodity;
import org.wang.mall.service.CategoryService;


/**
 * Created by ozintel06 on 16/8/18.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  08/18/2016 16:15
 */
@Controller
@RequestMapping(value = "/category")
public class CategoryController {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private CategoryService categoryService;

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
  public String categoryListBySales(HttpServletRequest request) {
    List<Category> categoryList = categoryService.findAll();
    request.setAttribute("categoryList", categoryList);

    return "category/categoryList";
// return "mall";
  }

} // end class CategoryController
