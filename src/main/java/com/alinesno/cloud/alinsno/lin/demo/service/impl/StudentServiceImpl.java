package com.alinesno.cloud.alinsno.lin.demo.service.impl;

import com.alinesno.cloud.alinsno.lin.demo.entity.StudentEntity;
import com.alinesno.cloud.alinsno.lin.demo.service.IStudentService;
import com.alinesno.cloud.common.core.service.impl.IBaseServiceImpl;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>  服务实现类 </p>
 *
 * @author 张三
 * @since 2020-01-14 06:35:36
 */
@Service
public class StudentServiceImpl extends IBaseServiceImpl<StudentEntity, String> implements IStudentService {

	//日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(StudentServiceImpl.class);

}
