package com.alinesno.cloud.alinsno.lin.demo.service.impl;

import com.alinesno.cloud.alinsno.lin.demo.entity.TeacherEntity;
import com.alinesno.cloud.alinsno.lin.demo.service.ITeacherService;
import com.alinesno.cloud.common.core.service.impl.IBaseServiceImpl;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>  服务实现类 </p>
 *
 * @author 张三
 * @since 2019-10-12 22:43:30
 */
@Service
public class TeacherServiceImpl extends IBaseServiceImpl<TeacherEntity, String> implements ITeacherService {

	//日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(TeacherServiceImpl.class);

}
