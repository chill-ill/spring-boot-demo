package com.xzw.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author xzw
 * @version 1.0
 * @date 2022/9/1 20:19
 */
@Configuration
@MapperScan({"com.xzw.mapper"})
public class DemoConfiguration {
}
