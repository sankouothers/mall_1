package org.wang.mall.service;

import org.wang.mall.model.Consumer;


/**
 * Created by ozintel06 on 16/7/27.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  08/22/2016 14:38
 */
public interface ConsumerService {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * findByName.
   *
   * @param   name  String
   *
   * @return  Consumer
   */
  Consumer findByName(String name);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findByNameAndPassWord.
   *
   * @param   name      String
   * @param   password  String
   *
   * @return  Consumer
   */
  Consumer findByNameAndPassWord(String name, String password);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findOne.
   *
   * @param   id  Long
   *
   * @return  Consumer
   */
  Consumer findOne(Long id);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * save.
   *
   * @param  consumer  Consumer
   */
  void save(Consumer consumer);
} // end interface ConsumerService
