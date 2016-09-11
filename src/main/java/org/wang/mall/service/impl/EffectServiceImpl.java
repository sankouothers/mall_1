package org.wang.mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import org.wang.mall.model.Effect;
import org.wang.mall.repository.EffectRepository;
import org.wang.mall.service.EffectService;


/**
 * Created by ozintel06 on 16/7/27.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  09/07/2016 16:59
 */
@Service @Transactional public class EffectServiceImpl implements EffectService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  /** TODO: DOCUMENT ME! */
  @Autowired EffectRepository effectRepository;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.mall.service.EffectService#findAll()
   */
  @Override public List<Effect> findAll() {
    return (List<Effect>) effectRepository.findAll();
  }
}
