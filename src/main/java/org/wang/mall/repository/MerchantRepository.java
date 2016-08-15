package org.wang.mall.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import org.wang.mall.model.Merchant;


/**
 * Created by ozintel06 on 16/6/21.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/21/2016 16:34
 */
@Repository public interface MerchantRepository extends CrudRepository<Merchant, Long> {

    Merchant findByNameAndPassWord(String name, String password);

    Merchant findByName(String name);
}
