package org.wang.mall.repository;

import org.springframework.data.repository.CrudRepository;
import org.wang.mall.model.Category;

/**
 * Created by ozintel06 on 16/7/27.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
