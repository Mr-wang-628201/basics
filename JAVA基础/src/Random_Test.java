import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/6
 * Time : 10:57
 * Description :
 */
public class Random_Test {
    public static void main(String[] args) {
        Random random = new Random();
        List list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            // 随机生成0-9的数字
            int number = random.nextInt(10)+1;
            list.add(number);
        }
        System.out.println(list.toString());
        System.out.println(list.get(2));
        System.out.println(list.size());
        //  返回删除的元素
        int remove = (int)list.remove(2);
        System.out.println(remove);
        System.out.println(list.get(2));
        System.out.println(list.size());
    }
}
