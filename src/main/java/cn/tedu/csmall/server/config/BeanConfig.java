package cn.tedu.csmall.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

//在Spring框架的使用中，如果某个类添加了@Configuration注解，则此类将是"配置类。
//注意：配置类也必须在组件扫描的范围内。
//在配置类中，可以自行添加一些方法，在方法上添加@Bean注解，则此方法会被Spring自动调用，且方法返回的
//对象也会被Spring管理。
@Deprecated
@Configuration
public class BeanConfig {
    @Bean
    public Date date(){
        System.out.println("BeanConfig.date");
    return new Date();
    }

    @Bean
    public Calendar calendar(){
        System.out.println("BeanConfig.calendar");
        return Calendar.getInstance();
    }

    @Bean
    public LocalDateTime localDateTime(){
        System.out.println("BeanConfig.LocalDateTime");
        return LocalDateTime.now();
    }
}
