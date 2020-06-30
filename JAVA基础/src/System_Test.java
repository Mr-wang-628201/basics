import java.util.Arrays;

/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/8
 * Time : 11:24
 * Description :
 */
public class System_Test {
    public static void main(String[] args) {
        //  当前系统的时间
        long date = System.currentTimeMillis();
        System.out.println("当前系统时间："+date);
        int[] a = {1,2,3,4,5};
        int[] b = {6,7,8,9,10};
        //  将数组中指定的数据拷贝到另一个数组中 系统级别的拷贝，效率很高
        System.arraycopy(a,1,b,0,3);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }
}
