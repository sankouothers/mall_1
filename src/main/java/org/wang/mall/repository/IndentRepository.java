package org.wang.mall.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import org.wang.mall.model.Indent;


/**
 * Created by ozintel06 on 16/7/27.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  09/04/2016 17:14
 */
public interface IndentRepository extends CrudRepository<Indent, Long> {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * findByIsConfirm.
   *
   * @param   isConfirm  boolean
   *
   * @return  List
   */
  List<Indent> findByIsConfirm(boolean isConfirm);
}
