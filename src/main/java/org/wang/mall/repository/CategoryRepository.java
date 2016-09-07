package org.wang.mall.repository;

import org.springframework.data.repository.CrudRepository;

import org.wang.mall.model.Category;


/**
 * Created by ozintel06 on 16/7/27.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  09/07/2016 16:58
 */
public interface CategoryRepository extends CrudRepository<Category, Long> { }
