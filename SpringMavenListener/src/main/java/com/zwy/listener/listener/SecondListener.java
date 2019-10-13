package com.zwy.listener.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * springBoot 整合 Listener方式二
 *
 * <listener>
 * <listener-class>com.bjsxt.listener.FirstListener</listener-class> *</listener>
 */
public class SecondListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("SecondListener...init...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
