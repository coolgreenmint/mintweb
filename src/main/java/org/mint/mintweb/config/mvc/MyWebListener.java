package org.mint.mintweb.config.mvc;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @ClassName: MyWebListener
 * @Description: TODO
 * @author: Administrator
 * @date: 2021/11/10 10:14
 */
@WebListener
public class MyWebListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("监听到context初始化");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("监听到context销毁");
    }
}
