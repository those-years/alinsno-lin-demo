package com.alinesno.cloud.alinsno.lin.demo.service;

import org.springframework.data.repository.NoRepositoryBean;
import com.alinesno.cloud.alinsno.lin.demo.entity.StudentEntity;
import com.alinesno.cloud.common.facade.services.IBaseService;

/**
 * <p>  服务类 </p>
 *
 * @author 张三
 * @since 2019-12-25 10:15:23
 */
@NoRepositoryBean
public interface IStudentService extends IBaseService<StudentEntity, String> {

}
