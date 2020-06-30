package com.basics;

import java.util.Scanner;

public class Test_Exception {
    public static void main(String[] args) {
        System.out.println("请输入要查询的分数：");
        Scanner scanner = new Scanner(System.in);
        int fenshu = scanner.nextInt();
        try {
            new CheckScore().Check(fenshu);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
    //检查分数是否合理
class CheckScore {
    public void Check(int fenshu) throws MyException {
        if(fenshu>=90&&fenshu<=120){
            System.out.println("你的分数是："+fenshu+" 不错继续努力");
        }else if(fenshu>=72&&fenshu<90){
            System.out.println("你的分数是："+fenshu+" 加油，下次上 90 分");
        }else if (fenshu>=0&&fenshu<72){
            System.out.println("你的分数是："+fenshu+" 都没及格，还要努力啊");
        }else {
            throw new MyException("你输入的分数异常，不在 0--120 的范围");
        }
    }
}
    //自定义的异常类
class MyException extends Exception{
    public MyException(String message) {
        super(message);
    }
}