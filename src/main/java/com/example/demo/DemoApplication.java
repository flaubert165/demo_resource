package com.example.demo;

import com.example.demo.domain.entities.User;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@MappedTypes(User.class)
@MapperScan("infrastructure/persistence")
@ComponentScan({"com.example.demo.service",
                "com.example.demo.persistence",
                "com.example.demo.controllers",
                "com.example.demo.domain",
                "com.example.demo.cors",
                "com.example.demo.config",
                "com.example.demo.auth"})
public class DemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
