package com.basics;

import java.util.*;

/**
 * ​	Collection：单列集合类的根接口，用于存储一系列符合某种规则的元素，
 * 它有两个重要的子接口，分别是 java.util.**List** 和 java.util.**Set**
 *
 * ​	 List :	 ArrayList 、Vector	和	LinkedList
 *
 * ​		ArrayList ：ArrayList和Vector使用了数组的实现，可以认为ArrayList或者Vector封装了对内部数组的操作，
 * 比如向数组中添加，删除，插入新的元素或者数据的扩展和重定向。
 *
 * ​		LinkedList :LinkedList使用了循环双向链表数据结构。与基于数组ArrayList相比，这是两种截然不同的实现技术，
 * 这也决定了它们将适用于完全不同的工作场景。
 *
 ArrayList 默认初始容量为10
 线程不安全，查询速度快
 　　　　底层数据结构是数组结构
 　　　　扩容增量：原容量的 0.5倍
 　　　　如 ArrayList的容量为10，一次扩容后是容量为15

 同样可以通过分析源码知道：
 Vector：线程安全，但速度慢
 　　　　底层数据结构是数组结构
 　　　　加载因子为1：即当 元素个数 超过 容量长度 时，进行扩容
 　　　　扩容增量：原容量的 1倍
 　　　　如 Vector的容量为10，一次扩容后是容量为20

 Set(集) 元素无序的、不可重复。

 HashSet：线程不安全，存取速度快
 　　　　　底层实现是一个HashMap（保存数据），实现Set接口
 　　　　　默认初始容量为16（为何是16，见下方对HashMap的描述）
 　　　　　加载因子为0.75：即当 元素个数 超过 容量长度的0.75倍 时，进行扩容
 　　　　　扩容增量：原容量的 1 倍
 　　　　　如 HashSet的容量为16，一次扩容后是容量为32
 *
 *
 *
 * ​	set:		HashSet		和		LinkedHashSet
 *
 * ​		HashSet: 无序的集合
 *
 * ​		（哈希表）：哈希表底层采用数组+链表实现，即使用链表处理冲突，同一hash值的链表都存储在一个链表里。 但是当位于一个桶中的元素较多，
 * 即hash值相等的元素较多时，通过key值依次查找的效率较低。而JDK1.8中，哈 希表存储采用数组+链表+红黑树实现，当链表长度超过阈值（8）时，
 * 将链表转换为红黑树，这样大大减少了查找 时间。
 *
 * ​		LinkedHashSet : 双有序的集合
 */
public class Test_List {
    public static void main(String[] args) {
        //ArrayList<String> str = Test_ArrayList.ArrayList();
        //LinkedList<String> str = Test_LinkedList.LinkedList();
        //HashSet<String> str = Test_HashSet.HashSet();
        LinkedHashSet<String> str = Test_LinkedHashSet.LinkedHashSet();
        int size = str.size();
        System.out.println("str集合中有 "+size+" 个元素");
        System.out.println("使用迭代器遍历");
        Iterator<String> iterator = str.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.print(next+" ");
        }
        System.out.println();
        System.out.println("使用增强for循环遍历");
        for (String s : str) {
            System.out.print(s+" ");
        }
    }

}

class Test_ArrayList{
    public static ArrayList<String> ArrayList(){
        ArrayList<String> str = new ArrayList<>();
        str.add("张三");
        str.add("李四");
        str.add("王五");
        str.add("赵六");
        str.add("田七");
        return str;
    }
}

class Test_LinkedList{
    public static LinkedList<String> LinkedList(){
        LinkedList<String> str = new LinkedList();
        str.add("刘备");
        str.add("关羽");
        str.add("张飞");
        str.add("曹操");
        str.add("孙权");
        return str;
    }
}

class Test_HashSet{
    public static HashSet<String> HashSet(){
        HashSet<String> str = new HashSet();
        str.add("中国1");
        str.add("日本2");
        str.add("韩国3");
        str.add("印度4");
        str.add("缅甸5");
        return str;
    }
}

class Test_LinkedHashSet{
    public static LinkedHashSet<String> LinkedHashSet(){
        //  LinkedHashSet是 HashSet的子类
        LinkedHashSet<String> str = new LinkedHashSet();
        str.add("美国1");
        str.add("德国2");
        str.add("英国3");
        str.add("法国4");
        str.add("芬兰5");
        return str;
    }
}