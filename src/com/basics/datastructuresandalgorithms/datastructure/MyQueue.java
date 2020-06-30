package com.basics.datastructuresandalgorithms.datastructure;

import java.util.LinkedList;

/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/27
 * Time : 15:48
 * Description : 一个简单的队列
 */
public class MyQueue<E> {
    LinkedList list = new LinkedList<E>();
    //enqueue 入队
    public void Enqueue(E e){
        list.addLast(e);
    }
    //dequeue 出队
    public Object Dequeue(){
        return list.removeFirst();
    }
}
