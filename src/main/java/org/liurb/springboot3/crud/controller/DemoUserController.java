package org.liurb.springboot3.crud.controller;

import jakarta.annotation.Resource;
import org.liurb.springboot3.crud.entity.DemoUser;
import org.liurb.springboot3.crud.service.DemoUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author liurb
 * @since 2024-05-18
 */
@RestController
@RequestMapping("/crud/demoUser")
public class DemoUserController {

    @Resource
    DemoUserService demoUserService;

    @GetMapping("/{userId}")
    public DemoUser user(@PathVariable Long userId) {

        return demoUserService.getById(userId);
    }

}
