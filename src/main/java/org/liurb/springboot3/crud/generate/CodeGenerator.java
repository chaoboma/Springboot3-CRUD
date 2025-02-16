package org.liurb.springboot3.crud.generate;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.nio.file.Paths;
import java.util.Collections;

/**
 * mybatis-plus代码生成器
 *
 * 官方配置说明
 * https://baomidou.com/pages/981406/
 *
 */
public class CodeGenerator {

    // 数据库连接配置
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String JDBC_URL = "jdbc:mysql://192.168.1.31:3307/my_db?useSSL=false";
    private static final String JDBC_USER_NAME = "test_usr";
    private static final String JDBC_PASSOWRD = "test_usr#Passw0rd";

    // 输出目录
    private static final String MAIN_JAVA_PATH = "/src/main/java";
    private static final String MAIN_MAPPER_PATH = "/src/main/resources/mapper";

    // 包名和模块名
    private static final String PACKAGE_NAME = "org.liurb.springboot3";
    private static final String MODULE_NAME = "crud";


    // 表名，多个表使用英文逗号分割
    private static final String TBL_NAMES = "demo_user";

    // 表名的前缀，从表生成代码时会去掉前缀
    private static final String TABLE_PREFIX = "";


    // 生成代码入口main方法
    public static void main(String[] args) {

        FastAutoGenerator.create(JDBC_URL, JDBC_USER_NAME, JDBC_PASSOWRD)
                .globalConfig(builder -> builder
                        .author("liurb") // 设置作者
                        .outputDir(Paths.get(System.getProperty("user.dir")) + MAIN_JAVA_PATH) // 输出路径
                        .commentDate("yyyy-MM-dd")
                        .disableOpenDir() // 禁止打开输出目录
                )
                .packageConfig(builder -> builder
                        .parent(PACKAGE_NAME) // 设置需要生成的表名
                        .moduleName(MODULE_NAME) // 设置过滤表前缀
                        .pathInfo(Collections.singletonMap(OutputFile.xml, Paths.get(System.getProperty("user.dir")) + MAIN_MAPPER_PATH)) // 设置mapperXml生成路径
                )
                .strategyConfig(builder -> builder
                        .addInclude(TBL_NAMES) // 设置需要生成的表名
                        .addTablePrefix(TABLE_PREFIX) // 设置过滤表前缀
                        .entityBuilder() // 设置实体类
                        .enableFileOverride() // 实体类覆盖
                        .enableTableFieldAnnotation() // 属性加上说明注释
                        .enableLombok() // 使用lombok
                        .serviceBuilder() // 设置服务类
                        .formatServiceFileName("%sService") // 格式化service类
                )
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();

    }

}
