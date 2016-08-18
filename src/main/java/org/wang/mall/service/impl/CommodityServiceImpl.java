package org.wang.mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Sort;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import org.wang.mall.model.Commodity;
import org.wang.mall.repository.CommodityRepository;
import org.wang.mall.service.CommodityService;


/**
 * Created by ozintel06 on 16/7/27.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  08/16/2016 17:26
 */
@Service @Transactional public class CommodityServiceImpl implements CommodityService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  /** TODO: DOCUMENT ME! */
  @Autowired private CommodityRepository commodityRepository;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.mall.service.CommodityService#findTop12ByOrderBySalesDesc()
   */
  @Override public List<Commodity> findTop12ByOrderBySalesDesc() {
// new Sort(new Sort.Order(Sort.Direction.ASC, "sales"))
    return commodityRepository.findTop12ByOrderBySalesDesc();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.mall.service.CommodityService#findTop5ByOrderByCreateDateDesc()
   */
  @Override public List<Commodity> findTop5ByOrderByCreateDateDesc() {
    return commodityRepository.findTop5ByOrderByCreateDateDesc();
  }
} // end class CommodityServiceImpl
