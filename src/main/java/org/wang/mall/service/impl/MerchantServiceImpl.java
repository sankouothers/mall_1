package org.wang.mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.wang.mall.model.Merchant;
import org.wang.mall.repository.MerchantRepository;
import org.wang.mall.service.MerchantService;

/**
 * Created by ozintel06 on 16/7/27.
 */
@Service
@Transactional
public class MerchantServiceImpl implements MerchantService {
    @Autowired
    private MerchantRepository merchantRepository;
    @Override
    public Merchant findByNameAndPassWord(String name, String password) {
        return merchantRepository.findByNameAndPassWord(name,password);
    }
}
