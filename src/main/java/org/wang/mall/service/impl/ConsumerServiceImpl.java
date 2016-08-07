package org.wang.mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.wang.mall.model.Consumer;
import org.wang.mall.repository.ConsumerRepository;
import org.wang.mall.service.ConsumerService;

/**
 * Created by ozintel06 on 16/7/27.
 */
@Service
@Transactional
public class ConsumerServiceImpl implements ConsumerService {
    @Autowired
    private ConsumerRepository consumerRepository;

    @Override
    public Consumer findByNameAndPassWord(String name, String password) {
        return consumerRepository.findByNameAndPassWord(name,password);
    }

    @Override
    public void save(Consumer consumer) {
        consumerRepository.save(consumer);
    }
}
