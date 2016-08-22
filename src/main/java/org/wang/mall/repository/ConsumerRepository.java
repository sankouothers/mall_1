package org.wang.mall.repository;

import org.springframework.data.repository.CrudRepository;

import org.wang.mall.model.Consumer;


/**
 * Created by ozintel06 on 16/7/27.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  08/22/2016 14:39
 */
public interface ConsumerRepository extends CrudRepository<Consumer, Long> {
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
}
