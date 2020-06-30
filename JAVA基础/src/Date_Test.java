import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/8
 * Time : 10:57
 * Description :
 */
public class Date_Test {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getTime());
        //  格式化时间的工具类 构造方法中传入格式化的格式 y-年，M-月，d-日，H-时，m-分，s-秒
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //  format 方法把 Date 格式化为字符串
        String str = df.format(date);
        System.out.println(str);
        try {
            //  parse 方法把字符串转化为 Date 对象
            Date date1 = df.parse(str);
            System.out.println(date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
