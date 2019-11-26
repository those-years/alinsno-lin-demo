package com.alinesno.cloud.alinsno.lin.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import com.alinesno.cloud.common.web.enable.EnableAlinesnoCommonLogin;

/**
 * 启动入口
 *
 * @author ${author}
 * @sine 2019-11-26 02:11:787
 */
@EnableJpaAuditing
@SpringBootApplication
@EnableAlinesnoCommonLogin
public class AlinsnoLinDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(AlinsnoLinDemoApplication.class, args);
	}
}

