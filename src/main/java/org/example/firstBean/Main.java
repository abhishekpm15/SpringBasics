package org.example.firstBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationFirstBeanContext.xml");
        FirstBean bean = (FirstBean) context.getBean("myFirstBean");
        System.out.println(bean);
    }
}