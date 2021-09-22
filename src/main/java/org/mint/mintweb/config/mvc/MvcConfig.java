package org.mint.mintweb.config.mvc;

import org.mint.mintweb.Interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName: MvcConfig
 * @Description: 扩展mvc功能(自定义视图解析器)
 * @author: mint
 * @date: 2021/9/17 17:42
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    //自定义国际化组件
    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocalResolver();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //将自己写的拦截器加入springmvc
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").
                excludePathPatterns("/", "/login", "/i18n/**", "/css/**", "/fonts/**", "/images/**", "/js/**");
    }
}
