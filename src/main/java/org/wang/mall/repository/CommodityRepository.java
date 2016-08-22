package org.wang.mall.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import org.springframework.stereotype.Repository;

import org.wang.mall.model.Commodity;


/**
 * Created by ozintel06 on 16/7/27.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  08/16/2016 17:26
 */
@Repository public interface CommodityRepository extends CrudRepository<Commodity, Long>,
  PagingAndSortingRepository<Commodity, Long> {
  //~ Methods ----------------------------------------------------------------------------------------------------------

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
} // end interface CommodityRepository
