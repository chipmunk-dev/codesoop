package com.chipmunk.codesoop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chipmunk.codesoop")
public class CodesoopApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodesoopApplication.class, args);
	}

}
