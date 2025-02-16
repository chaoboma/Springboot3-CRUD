package org.liurb.springboot3.crud.service.impl;

import org.liurb.springboot3.crud.entity.DemoUser;
import org.liurb.springboot3.crud.mapper.DemoUserMapper;
import org.liurb.springboot3.crud.service.DemoUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author liurb
 * @since 2024-05-18
 */
@Service
public class DemoUserServiceImpl extends ServiceImpl<DemoUserMapper, DemoUser> implements DemoUserService {

}
