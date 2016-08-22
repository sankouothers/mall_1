package org.wang.mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import org.wang.mall.model.Consumer;
import org.wang.mall.repository.ConsumerRepository;
import org.wang.mall.service.ConsumerService;


/**
 * Created by ozintel06 on 16/7/27.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  08/22/2016 14:39
 */
@Service @Transactional public class ConsumerServiceImpl implements ConsumerService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private ConsumerRepository consumerRepository;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.mall.service.ConsumerService#findByName(java.lang.String)
   */
  @Override public Consumer findByName(String name) {
    return consumerRepository.findByName(name);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.mall.service.ConsumerService#findByNameAndPassWord(java.lang.String, java.lang.String)
   */
  @Override public Consumer findByNameAndPassWord(String name, String password) {
    return consumerRepository.findByNameAndPassWord(name, password);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.mall.service.ConsumerService#findOne(java.lang.Long)
   */
  @Override public Consumer findOne(Long id) {
    return consumerRepository.findOne(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.mall.service.ConsumerService#save(org.wang.mall.model.Consumer)
   */
  @Override public void save(Consumer consumer) {
    consumerRepository.save(consumer);
  }
} // end class ConsumerServiceImpl
