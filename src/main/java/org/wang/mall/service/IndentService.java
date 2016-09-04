package org.wang.mall.service;

import java.util.List;

import org.wang.mall.model.Indent;


/**
 * Created by ozintel06 on 16/7/27.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  09/04/2016 04:15
 */
public interface IndentService {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * findByIsConfirm.
   *
   * @param   isConfirm  boolean
   *
   * @return  List
   */
  List<Indent> findByIsConfirm(boolean isConfirm);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * save.
   *
   * @param  indent  Indent
   */
  void save(Indent indent);
}
