package com.usc.renting.config;
/*
*  @author liqiqiorz
*  @date 2020.04.07
* */
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
public class CORSConfiguration extends WebMvcConfigurerAdapter{
        @Override//配置在config包下
            public void addCorsMappings(CorsRegistry registry) {
                // 所有请求都允许跨域
                registry.addMapping("/**")
                        .allowedOrigins("*")
                        .allowedMethods("*")
                        .allowedHeaders("*");
            }


}