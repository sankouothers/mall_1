package org.wang.mall.repository;

import org.springframework.data.repository.CrudRepository;
import org.wang.mall.model.Consumer;

/**
 * Created by ozintel06 on 16/7/27.
 */
public interface ConsumerRepository extends CrudRepository<Consumer, Long> {
    Consumer findByNameAndPassWord(String name,String password);

    Consumer findByName(String name);
}
