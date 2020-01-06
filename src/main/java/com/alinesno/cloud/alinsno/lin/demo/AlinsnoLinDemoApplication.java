package com.alinesno.cloud.alinsno.lin.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import com.alinesno.cloud.common.web.enable.EnableLogin;

/**
 * 启动入口
 *
 * @author ${author}
 * @sine 2020-01-06 13:01:785
 */
@EnableJpaAuditing
@SpringBootApplication
@EnableLogin
public class AlinsnoLinDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(AlinsnoLinDemoApplication.class, args);
	}
}

