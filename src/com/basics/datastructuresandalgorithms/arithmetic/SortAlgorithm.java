package com.basics.datastructuresandalgorithms.arithmetic;


/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/27
 * Time : 23:06
 * Description : 排序算法
 */
public class SortAlgorithm {
    public static void main(String[] args) {

        int sum =20;
        int[] ints = new int[sum];
        for (int i = 0; i < sum; i++) {
            ints[i] = (int)(Math.random()*100);
        }
        System.out.println("------------------排序前的数组------------------");
        System.out.println(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]+"  ");
        }
        System.out.println();
//        System.out.println("------------------冒泡排序------------------");
//        int[] bubbling = SortAlgorithm.bubblingSort(ints);
//        for (int i = 0; i < ints.length; i++) {
//            System.out.print(ints[i]+"  ");
//        }
//        System.out.println();
//        System.out.println(bubbling);

//        System.out.println("------------------插入排序------------------");
//        int[] insertSort = SortAlgorithm.insertSort(ints);
//        for (int i = 0; i < ints.length; i++) {
//            System.out.print(ints[i]+"  ");
//        }
//        System.out.println();
//        System.out.println(insertSort);

        System.out.println("------------------分治排序------------------");
        quickSort(ints,0,ints.length-1);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]+"  ");
        }
    }

    /**
     * 冒泡排序
     * @param ints
     * @return 完成排序的集合
     */
    public static int[] bubblingSort(int[] ints){
        if (ints == null && ints.length <= 1){
            System.out.println("参数不符合排序条件。。。");
            return null;
        }
        for (int i = 0; i < ints.length-1; i++) {
            //int num = 0 ;
            for (int a = 0; a < ints.length-1; a++) {
                if (ints[a] > ints[a+1]){
                    int num = ints[a];
                    ints[a] = ints[a+1];
                    ints[a+1] =num;
                }
            }
        }
        return ints;
    }

    /**
     * 插入排序
     * @param ints
     * @return
     */
    public static int[] insertSort(int[] ints){
        //  判断数组长度 如果长度小于2 也就没必要排序了
        if (ints.length >= 2){
            //  从第二个数开始，插入排序
            for (int i = 1; i < ints.length; i++) {
                //  先取出索引为 i的一个数，与前面的比较（前面的已经按照从小到大的顺序排好了），
                //  一直往前面找，找个一个比自己小的数，排在它的后面。
                int x = ints[i];
                int j = i-1;
                while ( j >= 0 && ints[j] > x ){
                    //  让前面一个数的值占着后面这个坑位
                    ints[j+1] = ints[j];
                    //  一直往前挪，直到符合条件
                    j--;
                }
                // j+1 的原因的为了和while循环里面的 j-- 相抵消
                ints[j+1] = x;
            }
        }
        return ints;
    }

    /**
     * 快速排序 / 分治排序
     * @param ints
     * @param begin  开始的数字
     * @param end   结束的数字
     * @return  分治排序：把第开始的数确定为基数，然后
     */
    public static void quickSort(int[] ints,int begin,int end){
        //  排序数组的开始索引
        int a = begin;
        //  排序数组的结束索引
        int b = end;

        if ( a >= b ){
            System.out.println("参数传入错误。。。");
            // 直接结束 没必要再排序了
            return;
        }
        //  将基数赋值给 x
        int x = ints[a];

        while (a < b){
            //  从后往前找 找比基数小的值
            while ( a < b && ints[b] >= x){
                b--;
            }
            if (a < b){
                ints[a] = ints[b];
                a++;
            }
            //  从前往后找 找比基数大的值
            while ( a<b && ints[a] <= x){
                a++;
            }
            if (a < b){
                ints[b] = ints[a];
                b--;
            }
        }
        //  把基数挪到左边比它都小 右边比它都大的位置
        ints[a] = x;
        //  通过递归把基数两边的数组再次排序分割
        SortAlgorithm.quickSort(ints,begin,a-1);
        SortAlgorithm.quickSort(ints,a+1,end);
    }
}
