package org.wang.mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import org.wang.mall.model.Merchant;
import org.wang.mall.repository.MerchantRepository;
import org.wang.mall.service.MerchantService;


/**
 * Created by ozintel06 on 16/7/27.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  08/22/2016 14:39
 */
@Service @Transactional public class MerchantServiceImpl implements MerchantService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private MerchantRepository merchantRepository;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.mall.service.MerchantService#findByName(java.lang.String)
   */
  @Override public Merchant findByName(String name) {
    return merchantRepository.findByName(name);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.mall.service.MerchantService#findByNameAndPassWord(java.lang.String, java.lang.String)
   */
  @Override public Merchant findByNameAndPassWord(String name, String password) {
    return merchantRepository.findByNameAndPassWord(name, password);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.mall.service.MerchantService#findOne(java.lang.Long)
   */
  @Override public Merchant findOne(Long id) {
    return merchantRepository.findOne(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.mall.service.MerchantService#save(org.wang.mall.model.Merchant)
   */
  @Override public void save(Merchant merchant) {
    merchantRepository.save(merchant);
  }
} // end class MerchantServiceImpl
