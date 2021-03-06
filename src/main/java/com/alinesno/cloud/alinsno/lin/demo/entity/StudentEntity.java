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
 * @since 2020-02-08 11:13:11
 */
@Entity
@Table(name="student")
public class StudentEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * name
     */
	private Integer name;
    /**
     * password
     */
	private Integer password;


	public Integer getName() {
		return name;
	}

	public void setName(Integer name) {
		this.name = name;
	}

	public Integer getPassword() {
		return password;
	}

	public void setPassword(Integer password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "StudentEntity{" +
			"name=" + name +
			", password=" + password +
			"}";
	}
}
