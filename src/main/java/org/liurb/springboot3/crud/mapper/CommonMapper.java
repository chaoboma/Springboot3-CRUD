package org.liurb.springboot3.crud.mapper;

import org.apache.ibatis.annotations.Param;
import org.liurb.springboot3.crud.entity.DemoUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author liurb
 * @since 2024-05-18
 */
public interface CommonMapper extends BaseMapper<DemoUser> {
    Object querySql(@Param("sql") String sql) ;
}
