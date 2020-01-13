package com.alinesno.cloud.alinsno.lin.demo.entity;

import javax.persistence.Table;
import javax.persistence.Entity;
import com.alinesno.cloud.common.facade.orm.entity.BaseEntity;


/**
 * <p>
 * 
 * </p>
 *
 * @author 张三
 * @since 2020-01-14 06:35:36
 */
@Entity
@Table(name="teacher")
public class TeacherEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 教师姓名
     */
	private Integer name;
    /**
     * 工号
     */
	private Integer number;


	public Integer getName() {
		return name;
	}

	public void setName(Integer name) {
		this.name = name;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}


	@Override
	public String toString() {
		return "TeacherEntity{" +
			"name=" + name +
			", number=" + number +
			"}";
	}
}
