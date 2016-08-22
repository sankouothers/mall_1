package org.wang.mall.service;

import java.util.List;

import org.wang.mall.model.Category;


/**
 * Created by ozintel06 on 16/7/27.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  08/19/2016 10:19
 */
public interface CategoryService {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * findAll.
   *
   * @return  List
   */
  List<Category> findAll();
}
