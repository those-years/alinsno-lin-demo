package com.alinesno.cloud.alinsno.lin.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alinesno.cloud.alinsno.lin.demo.entity.TeacherEntity;
import com.alinesno.cloud.alinsno.lin.demo.service.ITeacherService;

import com.alinesno.cloud.common.core.constants.SpringInstanceScope;
import com.alinesno.cloud.common.core.page.DatatablesPageBean;
import com.alinesno.cloud.common.web.base.advice.TranslateCode;
import com.alinesno.cloud.common.web.base.controller.FeignMethodController;

import org.springframework.stereotype.Controller;

/**
 * <p> 前端控制器 </p>
 *
 * @author 张三
 * @since 2019-10-12 22:43:30
 */
@Controller
@Scope(SpringInstanceScope.PROTOTYPE)
@RequestMapping("alinsno/lin/demo/teacher")
public class TeacherController extends FeignMethodController<TeacherEntity, ITeacherService> {

	//日志记录
	private static final Logger log = LoggerFactory.getLogger(TeacherController.class);

	@Autowired
	private ITeacherService teacherService; 

	@TranslateCode(value="[{hasStatus:has_status}]")
	@ResponseBody
	@PostMapping("/datatables")
    public DatatablesPageBean datatables(HttpServletRequest request , Model model ,  DatatablesPageBean page){
		log.debug("page = {}" , ToStringBuilder.reflectionToString(page));
		return this.toPage(model, this.getFeign() , page) ;
    }

	@Override
	public ITeacherService getFeign() {
		return this.teacherService;
	}

}


























