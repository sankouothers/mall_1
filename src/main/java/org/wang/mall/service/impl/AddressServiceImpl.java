package org.wang.mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import org.wang.mall.model.Address;
import org.wang.mall.model.Consumer;
import org.wang.mall.repository.AddressRepository;
import org.wang.mall.service.AddressService;


/**
 * Created by ozintel06 on 16/7/27.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  09/05/2016 03:11
 */
@Service @Transactional public class AddressServiceImpl implements AddressService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  /** TODO: DOCUMENT ME! */
  @Autowired AddressRepository addressRepository;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.mall.service.AddressService#finByConsumer(org.wang.mall.model.Consumer)
   */
  @Override public List<Address> finByConsumer(Consumer consumer) {
    return addressRepository.findByConsumer(consumer);
  }

  @Override
  public void save(Address address) {
    addressRepository.save(address);
  }

  @Override
  public void setIsDefaultAddress(boolean b, Consumer consumer) {
    addressRepository.setIsDefaultAddress(b,consumer);
  }
}
