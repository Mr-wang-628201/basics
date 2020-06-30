package com.basics.datastructuresandalgorithms.arithmetic;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/28
 * Time : 14:51
 * Description :  二分查找算法 递归实现
 */
public class BinarySearch {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        Map map1 = new Hashtable<>();
        ConcurrentHashMap hashMap = new ConcurrentHashMap();
        Queue queue;
        //test1();
    }

    public static int locating(List<Integer> list,int begin,int end){

        int index = (begin+end)/2;
        if (begin == end){
            return begin;
        }
        if (index == list.get(index)){
            begin =index;
            locating(list,begin,end);
        }else if( index < list.get(index) ){

        }
        return 0;
    }

    public static void test1(){
        //  集合长度
        int extent = 20;
        List list = new ArrayList<>();
        for (int i = 0; i < extent; i++) {
            list.add(i);
        }
        System.out.println("删除元素前的集合："+list);
        int index = (int)(Math.random()*extent);
        System.out.println("删除的元素的索引为："+index);
        list.remove(index);
        System.out.println("删除元素后的集合："+list);
        System.out.println("----------------------通过二分查找定位本删除的元素的索引----------------------");
        int loc = locating(list,0,list.size()-1);
        if (index == loc){
            System.out.println("被删除的元素的索引为："+loc);
        }else {
            System.out.println("二分查找失败，请优化算法。。。");
        }
    }
}
