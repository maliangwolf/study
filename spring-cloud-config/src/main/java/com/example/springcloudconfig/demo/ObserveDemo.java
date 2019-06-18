package com.example.springcloudconfig.demo;

import org.springframework.context.ApplicationEvent;

import java.util.*;

/**
 * @author ml
 * @title: ObserveDemo
 * @projectName spring-cloud-config
 * @description: TODO
 * @date 2019/6/14 11:51
 */
public class ObserveDemo<meth> {
    public static void main(String[] args) {
        MyObserver observable=new MyObserver();
        //增加订阅者
        observable.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println(arg);
            }
        });
        System.out.println(123);
        observable.setChanged();
        //发布者通知，订阅者被动感知（推模式）
        observable.notifyObservers("hello world!");
        echoIterator();
    }

    private static  void echoIterator(){
        List<Integer> list = Arrays.asList(0,1,2,3);
        Iterator<Integer> integers=list.iterator();
        while (integers.hasNext()) {
            System.out.println(integers.next());
        }
    }
    public static class  MyObserver extends Observable{
        public  void setChanged() {
            super.setChanged();
        }
    }
}
