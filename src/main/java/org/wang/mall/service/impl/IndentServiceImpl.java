package org.wang.mall.service.impl;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import org.wang.mall.model.Indent;
import org.wang.mall.repository.IndentRepository;
import org.wang.mall.service.IndentService;


/**
 * Created by ozintel06 on 16/7/27.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  09/04/2016 04:15
 */
@Service @Transactional public class IndentServiceImpl implements IndentService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  /** TODO: DOCUMENT ME! */
  @Autowired IndentRepository indentRepository;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.mall.service.IndentService#save(org.wang.mall.model.Indent)
   */
  @Override public void save(Indent indent) {
    indentRepository.save(indent);
  }
}
