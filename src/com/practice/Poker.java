package com.practice;

import java.util.*;

public class Poker {
    public static void main(String[] args) {
        HashMap<Integer, String> pokerMap = new HashMap<>();//基本数据类型不能作为集合类型
        List<String> huase = new ArrayList();
        List<String> number = new ArrayList();
        Collections.addAll(huase,"♦","♣","♥","♠");
        Collections.addAll(number,"2","A","K","Q","J","10","9","8","7","6","5","4","3");
        int count = 1;
        //System.out.println(count++);  先打印再加
        //System.out.println(++count);  先加再打印
        pokerMap.put(count++,"大🃏");
        pokerMap.put(count++,"小🃏");
        for (String n : number) {
            for (String h : huase) {
                pokerMap.put(count++,n+h);
            }
        }
        //System.out.println(pokerMap);
        // 将key打乱 因为 set 是无序的（内部有默认顺序） 所以需要先转换为 List 进行打乱
        Set<Integer> keySet = pokerMap.keySet();
        List list = new ArrayList();
        list.addAll(keySet); //addAll 一次性将多个元素添加到集合中
        Collections.shuffle(list); //使用 Collections 工具类中的 shuffle 方法将集合打乱
        //System.out.println(list);
        ArrayList<Integer> zhangsan = new ArrayList<>();
        ArrayList<Integer> lisi = new ArrayList<>();
        ArrayList<Integer> wangwu = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();
        for(int i = 0;i < list.size(); i++){
            if(i<51){
                if(i%3==0){
                    zhangsan.add((Integer) list.get(i));
                }else if(i%3==1){
                    lisi.add((Integer) list.get(i));
                }else{
                    wangwu.add((Integer) list.get(i));
                }
            }else {
                dipai.add((Integer) list.get(i));
            }
        }
        Collections.sort(zhangsan);
        Collections.sort(lisi);
        Collections.sort(wangwu);
        Collections.sort(dipai);
        //System.out.println(zhangsan+" "+zhangsan.size());
        //System.out.println(lisi+" "+lisi.size());
        //System.out.println(wangwu+" "+wangwu.size());
        //System.out.println(dipai+" "+dipai.size());
        System.out.println("张三手里的牌是：");
        for (Integer i1 : zhangsan) {
            System.out.print(pokerMap.get(i1)+" ");
        }
        System.out.println();
        System.out.println("李四手里的牌是：");
        for (Integer i2 : lisi) {
            System.out.print(pokerMap.get(i2)+" ");
        }
        System.out.println();
        System.out.println("王五手里的牌是：");
        for (Integer i3 : wangwu) {
            System.out.print(pokerMap.get(i3)+" ");
        }
        System.out.println(" ");
        System.out.println("底牌是：");
        for (Integer i4 : dipai) {
            System.out.print(pokerMap.get(i4)+" ");
        }
    }
}
