package cn.tedu.csmall.server.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("cn.tedu.csmall.server.mapper")
public class MybatisConfiguration {
}
