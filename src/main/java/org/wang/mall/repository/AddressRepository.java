package org.wang.mall.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import org.wang.mall.model.Address;
import org.wang.mall.model.Consumer;


/**
 * Created by ozintel06 on 16/7/27.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  09/05/2016 03:11
 */
public interface AddressRepository extends CrudRepository<Address, Long> {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * findByConsumer.
   *
   * @param   consumer  Consumer
   *
   * @return  List
   */
  List<Address> findByConsumer(Consumer consumer);
}
