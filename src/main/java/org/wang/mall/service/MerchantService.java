package org.wang.mall.service;


import org.wang.mall.model.Merchant;


/**
 * Created by ozintel06 on 16/6/21.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/21/2016 11:00
 */
public interface MerchantService {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * findByName.
   *
   * @param   name  String
   *
   * @return  Merchant
   */
  Merchant findByName(String name);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findByNameAndPassWord.
   *
   * @param   name      String
   * @param   password  String
   *
   * @return  Merchant
   */
  Merchant findByNameAndPassWord(String name, String password);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findOne.
   *
   * @param   id  Long
   *
   * @return  Merchant
   */
  Merchant findOne(Long id);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * save.
   *
   * @param  merchant  Merchant
   */
  void save(Merchant merchant);
} // end interface MerchantService
