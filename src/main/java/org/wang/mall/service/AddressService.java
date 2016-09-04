package org.wang.mall.service;

import java.util.List;

import org.wang.mall.model.Address;
import org.wang.mall.model.Consumer;


/**
 * Created by ozintel06 on 16/7/27.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  09/05/2016 03:11
 */
public interface AddressService {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * finByConsumer.
   *
   * @param   consumer  Consumer
   *
   * @return  List
   */
  List<Address> finByConsumer(Consumer consumer);
}
