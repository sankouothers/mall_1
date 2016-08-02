package org.wang.mall.service;

import org.wang.mall.model.Consumer;

/**
 * Created by ozintel06 on 16/7/27.
 */
public interface ConsumerService {
    Consumer findByNameAndPassWord(String name, String password);
}
