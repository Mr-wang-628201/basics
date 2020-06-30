import java.util.Arrays;

/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/8
 * Time : 9:56
 * Description :
 */
public class Arrays_Test {
    public static void main(String[] args) {
        int[] arr = {6,23,65,5,98,34,12,77,9,1,23};
        System.out.println("数组地址："+arr);
        String str = Arrays.toString(arr);
        System.out.println("转为字符串："+str);
        Arrays.sort(arr);
        String str1 = Arrays.toString(arr);
        System.out.println("升序排序后："+str1);
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[arr.length-i-1]+",");
        }
        System.out.println("]");
    }
}
