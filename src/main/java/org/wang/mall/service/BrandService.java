package org.wang.mall.service;

import java.util.List;

import org.wang.mall.model.Brand;


/**
 * Created by ozintel06 on 16/7/27.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  09/07/2016 16:59
 */
public interface BrandService {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * findAll.
   *
   * @return  List
   */
  List<Brand> findAll();
}
