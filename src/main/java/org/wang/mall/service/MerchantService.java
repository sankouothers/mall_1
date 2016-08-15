package org.wang.mall.service;


import org.wang.mall.model.Merchant;

/**
 * Created by ozintel06 on 16/6/21.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/21/2016 11:00
 */
public interface MerchantService {

    Merchant findByNameAndPassWord(String name, String password);

    void save(Merchant merchant);

    Merchant findByName(String name);

    Merchant findOne(Long id);
}