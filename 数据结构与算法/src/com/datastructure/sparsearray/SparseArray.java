package com.datastructure.sparsearray;

/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/4/19
 * Time : 23:45
 * Description :
 */
public class SparseArray {
    public static void main(String[] args) {
        int cheaaArr1[][] = new int[11][11];
        cheaaArr1[1][2]=1;
        cheaaArr1[2][3]=2;
        cheaaArr1[4][5]=2;
        //  打印二维数组
        System.out.println("----------------最开始的二维数组-----------------");
        for (int[] ints : cheaaArr1) {
            for (int data : ints) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
        //  对二维数组中的值进行说明
        System.out.println("----------------对二维数组中的值进行说明-----------------");
        int sum = 0 ;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if(cheaaArr1[i][j] != 0){
                    sum++;
                    if(cheaaArr1[i][j]==1){
                        System.out.println("这是第"+sum+"个棋子，颜色是黑色"+"i:"+i+"  "+"j:"+j);
                    }else if(cheaaArr1[i][j]==2){
                        System.out.println("这是第"+sum+"个棋子，颜色是蓝色"+"i:"+i+"  "+"j:"+j);
                    }
                }
            }
        }
        System.out.println("在二维数组中，一个有 "+sum+" 个有效值");
        //  创建对应的稀疏数组
        int sparseArr[][] = new int[sum+1][3];
        //  把二维数组中的值存到稀疏数组中
        sparseArr[0][0] =11;
        sparseArr[0][1] =11;
        sparseArr[0][2] =sum;
        int count = 0 ;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if(cheaaArr1[i][j] != 0){
                    count++;
                    sparseArr[count][0] =i;
                    sparseArr[count][1] =j;
                    sparseArr[count][2] =cheaaArr1[i][j];
                }
            }
        }
        //  遍历稀疏数组
        System.out.println("----------------稀疏数组-----------------");
        for (int i = 0; i < sparseArr.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n",sparseArr[i][0],sparseArr[i][1],sparseArr[i][2]);
        }

        //  稀疏数组还原为二维数组
        int cheaaArr2[][] = new int[sparseArr[0][0]][sparseArr[0][1]];
        for (int i = 1; i < sparseArr.length; i++) {
            cheaaArr2[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }
        //  打印还原后的二维数组
        System.out.println("---------------- 原后的二维数组 -----------------");
        for (int[] ints : cheaaArr2) {
            for (int anInt : ints) {
                System.out.printf("%d\t",anInt);
            }
            System.out.println();
        }

    }
}
