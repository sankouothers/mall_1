package org.wang.mall.service;

import java.util.List;

import org.wang.mall.command.CommodityCommand;
import org.wang.mall.model.Commodity;
import org.wang.mall.model.Merchant;


/**
 * Created by ozintel06 on 16/7/27.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  08/16/2016 17:26
 */
public interface CommodityService {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * findAll.
   *
   * @return  List
   */
  List<Commodity> findAll();

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findByMerchantAndIsPutaway.
   *
   * @param   merchant  Merchant
   * @param   b         boolean
   *
   * @return  List
   */
  List<Commodity> findByMerchantAndIsPutaway(Merchant merchant, boolean b);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findByMerchantOrderBySalesDesc.
   *
   * @param   merchant  Merchant
   *
   * @return  List
   */
  List<Commodity> findByMerchantOrderBySalesDesc(Merchant merchant);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findByNameStartingWith.
   *
   * @param   queryText  String
   *
   * @return  List
   */
  List<Commodity> findByNameStartingWith(String queryText);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findOne.
   *
   * @param   id  Long
   *
   * @return  Commodity
   */
  Commodity findOne(Long id);

  //~ ------------------------------------------------------------------------------------------------------------------

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

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * save.
   *
   * @param  commodity  Commodity
   */
  void save(Commodity commodity);
} // end interface CommodityService
