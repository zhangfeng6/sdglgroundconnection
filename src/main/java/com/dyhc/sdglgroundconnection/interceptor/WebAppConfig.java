package com.dyhc.sdglgroundconnection.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class WebAppConfig implements WebMvcConfigurer {


    /**
     * 赵伟伟
     * 注册自定义拦截器，添加拦截路径和排除拦截路径
     * @param registry
     */
    /*@Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new InterceptorConfig()).addPathPatterns("/**").excludePathPatterns("/admins/login.html","/static/**","/login","/admin/**","/css/**","/font/**","/images/**","/js/**","/lay/modules/**");
    }*/

}