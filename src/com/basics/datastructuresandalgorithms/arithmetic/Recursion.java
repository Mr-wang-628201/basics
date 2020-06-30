package com.basics.datastructuresandalgorithms.arithmetic;

/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/27
 * Time : 20:46
 * Description : 递归算法
 *              什么是递归：简单点来说，就是一个函数直接或间接调用自身的一种方法，
 *              它通常把一个大型复杂的问题层层转化为一个与原问题相似的规模较小的问题来求解。
 *              什么时候该用递归：
 *                  子问题与原问题为相同的事情，且规模更小
 *                  明确程序停止条件
 */
public class Recursion {
    public static void main(String[] args) {
        int num =10;
        int sum = Recursion.Accumulation(num);
        System.out.println(sum);
    }
    public static int Accumulation(int num){
        if(num == 0){
           return  0;
        }
        return num + Accumulation(num - 1);
    }
}
