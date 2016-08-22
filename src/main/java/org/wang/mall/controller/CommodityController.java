package org.wang.mall.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.wang.mall.model.Commodity;
import org.wang.mall.service.CommodityService;


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

  /** TODO: DOCUMENT ME! */
  @Autowired private CommodityService commodityService;

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
} // end class CommodityController
