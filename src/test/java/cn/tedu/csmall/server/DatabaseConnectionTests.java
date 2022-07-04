package cn.tedu.csmall.server;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

//测试类必须
//在组件扫描的包下
//只有添加了 注解才会记载整个项目的运行环境(包括Spring 读取配置等
@SpringBootTest
public class DatabaseConnectionTests {

    //Spring Boot 自动读取 Application.properties的配置，并创建了数据源对象
    @Autowired
    DataSource dataSource;

    //连接数据库，可用于检查application.properties中的连接参数值是否正确
    @Test
    public void testConnection() throws Exception {
        //获取与MySQL的连接，此方法的调用会实质的连接数据库
        dataSource.getConnection();
        System.out.println("成功运行");
    }
}
