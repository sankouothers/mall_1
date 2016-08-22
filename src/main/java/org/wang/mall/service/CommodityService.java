package org.wang.mall.service;

import java.util.List;

import org.wang.mall.model.Commodity;


/**
 * Created by ozintel06 on 16/7/27.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  08/16/2016 17:26
 */
public interface CommodityService {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * findBySales.
   *
   * @return  List
   */
  List<Commodity> findTop12ByOrderBySalesDesc();

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findTop5ByOrderByCreateDateDesc.
   *
   * @return  List
   */
  List<Commodity> findTop5ByOrderByCreateDateDesc();

  List<Commodity> findAll();
}
