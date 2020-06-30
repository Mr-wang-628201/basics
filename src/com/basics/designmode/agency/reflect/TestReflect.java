package com.basics.designmode.agency.reflect;

import java.lang.reflect.Method;

/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/27
 * Time : 2:46
 * Description :
 */
public class TestReflect {
    public static void main(String[] args) {
        User user = new User();
        user.setName("张三");
        user.setAge(22);
        Class<? extends User> aClass = user.getClass();
        System.out.println("类的名称是："+aClass.getName());

        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }


    }
}
