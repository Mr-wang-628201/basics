package com.practice;

import java.util.*;

/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/29
 * Time : 17:01
 * Description :
 */
public class Connection {
    public static void main(String[] args) {
        getNumber();
    }

    public static void getNumber(){
        String number = "18584903096";
        char[] chars = number.toCharArray();
        Map<Integer, Character> map = new HashMap<>();
        List list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            map.put(i,chars[i]);
            list.add(i);
        }
        System.out.println(map);
        Collections.shuffle(list);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print("MAP 的 key是："+list.get(i));
            System.out.println("    MAP 的 value是："+map.get(list.get(i)));
        }
    }
}
