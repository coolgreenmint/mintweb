package org.mint.mintweb.config.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.tags.Param;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: MyDataSource
 * @Description: 初始化druid参数
 * @author: mint
 * @date: 2021/9/28 10:14
 */
@Configuration
public class DruidDataSourceConfig {

    @ConfigurationProperties("spring.datasource")
    @Bean
    public DataSource getDruidDataSource() {

        return new DruidDataSource();

    }

    /**
     * 配置后台监控平台
     *
     * @return
     */
    @Bean
    public ServletRegistrationBean statViewServlet() {
        ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");

        HashMap<String, String> params = new HashMap<>();
        params.put("loginUsername", "mint");
        params.put("loginPassword", "mint1989");

        bean.setInitParameters(params);

        return bean;
    }

    /**
     * 过滤器进行过滤（不统计的数据进行配置）
     *
     * @return
     */
//    @Bean
//    public FilterRegistrationBean a() {
//        FilterRegistrationBean bean = new FilterRegistrationBean();
//
//        Map<String, String> params = new HashMap<>();
//
//        //此处放置配置参数
//        params.put("", "");
//
//        bean.setInitParameters(params);
//        return bean;
//    }

}
