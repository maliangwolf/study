package com.example.springcloudconfig.demo;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ml
 * @title: SpringEventListenerDemo
 * @projectName spring-cloud-config
 * @description: TODO
 * @date 2019/6/14 16:03
 */
public class SpringEventListenerDemo {
    public static void main(String[] args) {
        //Annotation 驱动的spring上下文
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        //注册监听器
        context.addApplicationListener(new ApplicationListener<MyApplicationEvent>() {
            @Override
            public void onApplicationEvent(MyApplicationEvent applicationEvent) {
                System.out.println("receive event:"+applicationEvent.getSource());
            }
        });
        context.refresh();
        //发布事件

        //监听器得到事件
        context.publishEvent(new MyApplicationEvent("Hello world!"));

        context.publishEvent(new MyApplicationEvent("Jmf world!"));
    }

    private static class MyApplicationEvent extends ApplicationEvent{

        public MyApplicationEvent(Object source) {
            super(source);
        }
    }
}
