package org.wang.mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import org.wang.mall.model.Category;
import org.wang.mall.repository.CategoryRepository;
import org.wang.mall.service.CategoryService;


/**
 * Created by ozintel06 on 16/7/27.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  08/19/2016 10:19
 */
@Service @Transactional public class CategoryServiceImpl implements CategoryService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private CategoryRepository categoryRepository;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.mall.service.CategoryService#findAll()
   */
  @Override public List<Category> findAll() {
    return (List<Category>) categoryRepository.findAll();
  }
}
