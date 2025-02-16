package org.liurb.springboot3.crud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.liurb.**.mapper")
public class Springboot3CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot3CrudApplication.class, args);
	}

}
