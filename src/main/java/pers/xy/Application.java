package pers.xy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.servlet.MultipartConfigElement;


/**
 * @Description
 * @Date 2019/6/30
 * @Created by xiayun
 */
//@EnableAutoConfiguration
//@Configuration
//@ComponentScan
@SpringBootApplication  // 作用等同于上面三个
@MapperScan("pers.xy.mysqltest.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }


    @Bean
    public MultipartConfigElement multipartConfigElement(){
        MultipartConfigFactory factory = new MultipartConfigFactory();
        // 设置单个文件的大小
        factory.setMaxFileSize("10240KB");
        // 设置总上传文件的大小
        factory.setMaxRequestSize("102400KB");
        return factory.createMultipartConfig();
    }


}
