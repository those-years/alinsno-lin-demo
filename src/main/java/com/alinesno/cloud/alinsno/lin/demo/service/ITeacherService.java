package com.alinesno.cloud.alinsno.lin.demo.service;

import org.springframework.data.repository.NoRepositoryBean;
import com.alinesno.cloud.alinsno.lin.demo.entity.TeacherEntity;
import com.alinesno.cloud.common.facade.services.IBaseService;

/**
 * <p>  服务类 </p>
 *
 * @author 张三
 * @since 2020-01-14 22:08:32
 */
@NoRepositoryBean
public interface ITeacherService extends IBaseService<TeacherEntity, String> {

}
