import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/6
 * Time : 10:31
 * Description :
 */
public class Scanner_Test {
    int a;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据：");
        int a = sc.nextInt();
        System.out.println("请输入第一个数据：");
        int b = sc.nextInt();
        System.out.println("他们的和为："+(a+b));

    }
}
