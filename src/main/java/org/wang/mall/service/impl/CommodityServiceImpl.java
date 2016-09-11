package org.wang.mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Sort;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import org.wang.mall.model.Commodity;
import org.wang.mall.model.Merchant;
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
   * @see  org.wang.mall.service.CommodityService#findAll()
   */
  @Override public List<Commodity> findAll() {
    return (List<Commodity>) commodityRepository.findAll();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.mall.service.CommodityService#findByMerchantOrderBySalesDesc(org.wang.mall.model.Merchant)
   */
  @Override public List<Commodity> findByMerchantOrderBySalesDesc(Merchant merchant) {
    return commodityRepository.findByMerchantOrderBySalesDesc(merchant);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.mall.service.CommodityService#findByNameStartingWith(java.lang.String)
   */
  @Override public List<Commodity> findByNameStartingWith(String queryText) {
    return commodityRepository.findByNameStartingWith(queryText);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.mall.service.CommodityService#findOne(java.lang.Long)
   */
  @Override public Commodity findOne(Long id) {
    return commodityRepository.findOne(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

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

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.mall.service.CommodityService#save(org.wang.mall.model.Commodity)
   */
  @Override public void save(Commodity commodity) {
    commodityRepository.save(commodity);
  }
} // end class CommodityServiceImpl
