package com.basics;

import java.io.File;

public class Test_Recursion {
    public static void main(String[] args) {
        int i = getsum(10);
        System.out.println(i);
        File file = new File("E:\\IdeaProjects\\basics");
        printDir(file);
    }

public static void printDir(File dir){
    File[] files = dir.listFiles();
    for (File file : files) {
        if (file.isFile()){
            if (file.getName().endsWith(".java")){
                System.out.println("文件路径和文件名："+file.getAbsolutePath());
            }
        }else {
            printDir(file);
        }
    }
}

    public static int getsum(int i ){
        if (i == 0){
            return 0;//结束方法
        }
        return i+getsum(--i);
    }
}
