package org.wang.mall.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.wang.mall.command.CommodityCommand;
import org.wang.mall.command.CommodityInfoCommand;
import org.wang.mall.model.Brand;
import org.wang.mall.model.Category;
import org.wang.mall.model.Commodity;
import org.wang.mall.model.Effect;
import org.wang.mall.service.BrandService;
import org.wang.mall.service.CategoryService;
import org.wang.mall.service.CommodityService;
import org.wang.mall.service.EffectService;


/**
 * Created by ozintel06 on 16/8/16.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  08/16/2016 17:26
 */
@Controller
@RequestMapping(value = "/commodity")
public class CommodityController {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private BrandService    brandService;
  @Autowired private CategoryService categoryService;

  /** TODO: DOCUMENT ME! */
  @Autowired private CommodityService commodityService;
  @Autowired private EffectService    effectService;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * commodityList.
   *
   * @param   request  HttpServletRequest
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/commodityList",
    method = RequestMethod.GET
  )
  public String commodityList(HttpServletRequest request) {
    String queryText = request.getParameter("queryText");

    if (queryText != null) {
      List<Commodity> commodityList = commodityService.findByNameStartingWith(queryText);
      request.setAttribute("commodityList", commodityList);

      return "commodity/commodityList";
    }

    List<Commodity> commodityList = commodityService.findAll();
    request.setAttribute("commodityList", commodityList);

    return "commodity/commodityList";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * commodityListByCreateDate.
   *
   * @param   request  HttpServletRequest
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/commodityListByCreateDate",
    method = RequestMethod.GET
  )
  public String commodityListByCreateDate(HttpServletRequest request) {
    List<Commodity> commodityListByCreateDate = commodityService.findTop5ByOrderByCreateDateDesc();

    request.setAttribute("commodityListByCreateDate", commodityListByCreateDate);

    return "commodity/commodityListByCreateDate";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * loadCommodity.
   *
   * @param   request  HttpServletRequest
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/commodityListBySales",
    method = RequestMethod.GET
  )
  public String commodityListBySales(HttpServletRequest request) {
    List<Commodity> commodityListBySales = commodityService.findTop12ByOrderBySalesDesc();

    request.setAttribute("commodityListBySales", commodityListBySales);

    return "commodity/commodityListBySales";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * create.
   *
   * @param   request  HttpServletRequest
   * @param   command  CommodityCommand
   * @param   model    Model
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/create",
    method = RequestMethod.POST
  )
  public String create(HttpServletRequest request, CommodityCommand command, Model model) {
    Commodity commodity = command.toCommodity(command);
    commodityService.save(commodity);

    return "commodity/createSuccess";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toCreateView.
   *
   * @param   request  HttpServletRequest
   * @param   id       Long
   * @param   model    Model
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/create",
    method = RequestMethod.GET
  )
  public String toCreateView(HttpServletRequest request, Long id, Model model) {
    CommodityCommand command = new CommodityCommand();

    command.setMerchantId(id);

    List<Brand>    brandList    = brandService.findAll();
    List<Category> categoryList = categoryService.findAll();
    List<Effect>   effectList   = effectService.findAll();

    command.setBrandList(brandList);
    command.setEffectList(effectList);
    command.setCategoryList(categoryList);

    model.addAttribute("command", command);

    return "commodity/create";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toInfoView.
   *
   * @param   request  HttpServletRequest
   * @param   id       Long
   * @param   model    Model
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/info",
    method = RequestMethod.GET
  )
  public String toInfoView(HttpServletRequest request, Long id, Model model) {
    Commodity commodity = commodityService.findOne(id);

    CommodityInfoCommand command = new CommodityInfoCommand(commodity);

    model.addAttribute("command", command);

    return "commodity/info";
  }
} // end class CommodityController
