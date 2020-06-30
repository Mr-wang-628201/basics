package com.basics;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/19
 * Time : 22:34
 * Description :
 */
public class Test {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王五");

        System.out.println("--------------迭代器遍历--------------");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            String str = (String) iterator.next();
            System.out.println(str);
        }

        System.out.println("--------------增强for循环遍历(底层是迭代器)--------------");
        for (Object o : list) {
            String s = (String) o;
            System.out.println(s);
        }

        System.out.println("--------------for循环遍历--------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("--------------用来表示金钱的数据类型及其操作--------------");
        BigDecimal decimal = new BigDecimal("13.14");
        BigDecimal decimal1 = new BigDecimal("5.20");
        //  add, substract, multiply和divide 加 减 乘 除
        System.out.println(decimal.add(decimal1));
        System.out.println(decimal.subtract(decimal1));
        System.out.println(decimal.multiply(decimal1));
        System.out.println(decimal.divide(decimal1, RoundingMode.HALF_UP));
        System.out.println("--------------Char类型--------------");

        //  随机生成20个 0 到 1000 的整数
        for (int i = 0; i < 20; i++) {
            System.out.println((int)(Math.random()*1000));
        }



    }
}
