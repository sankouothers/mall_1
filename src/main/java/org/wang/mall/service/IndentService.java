package org.wang.mall.service;

import java.util.List;

import org.wang.mall.model.Consumer;
import org.wang.mall.model.Indent;
import org.wang.mall.model.Merchant;


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
   * findByIsConfirmAndConsumer.
   *
   * @param   b         boolean
   * @param   consumer  Consumer
   *
   * @return  List
   */
  List<Indent> findByIsConfirmAndConsumer(boolean b, Consumer consumer);

  //~ ------------------------------------------------------------------------------------------------------------------


  /**
   * findByIsConfirmAndMerchant.
   *
   * @param   b         boolean
   * @param   merchant  Merchant
   *
   * @return  List
   */
  List<Indent> findByIsConfirmAndMerchant(boolean b, Merchant merchant);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findOne.
   *
   * @param   id  Long
   *
   * @return  Indent
   */
  Indent findOne(Long id);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * save.
   *
   * @param  indent  Indent
   */
  void save(Indent indent);
} // end interface IndentService
