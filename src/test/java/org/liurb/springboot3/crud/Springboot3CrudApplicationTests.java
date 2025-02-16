package org.liurb.springboot3.crud;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.liurb.springboot3.crud.entity.DemoUser;
import org.liurb.springboot3.crud.service.DemoUserService;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot3CrudApplicationTests {

	@Resource
	DemoUserService demoUserService;

	@Test
	void contextLoads() {

//		DemoUser record = new DemoUser();
//		record.setName("李四");
//		record.setAge(18);
//		demoUserService.save(record);

		DemoUser record = demoUserService.getById(1);
		System.out.println(record);

	}

}
