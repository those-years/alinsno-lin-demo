package com.alinesno.cloud.alinsno.lin.demo.repository;

import com.alinesno.cloud.alinsno.lin.demo.entity.StudentEntity;
import com.alinesno.cloud.common.facade.orm.repository.IBaseJpaRepository;

/**
 * <p>
  *  持久层接口
 * </p>
 *
 * @author 张三
 * @since 2020-01-14 22:03:14
 */
public interface StudentRepository extends IBaseJpaRepository<StudentEntity, String> {

}
