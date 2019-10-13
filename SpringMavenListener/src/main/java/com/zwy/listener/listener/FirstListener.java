package com.zwy.listener.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * springBoot 整合 Listener方式一
 *
 * <listener>
 * <listener-class>com.bjsxt.listener.FirstListener</listener-class> *</listener>
 */
@WebListener
public class FirstListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Listener...init...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
