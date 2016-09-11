package org.wang.mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import org.wang.mall.model.Brand;
import org.wang.mall.repository.BrandRepository;
import org.wang.mall.service.BrandService;


/**
 * Created by ozintel06 on 16/7/27.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  09/07/2016 16:59
 */
@Service @Transactional public class BrandServiceImpl implements BrandService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  /** TODO: DOCUMENT ME! */
  @Autowired BrandRepository brandRepository;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.mall.service.BrandService#findAll()
   */
  @Override public List<Brand> findAll() {
    return (List<Brand>) brandRepository.findAll();
  }
}
