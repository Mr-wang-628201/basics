import java.util.*;

/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/8
 * Time : 14:49
 * Description :
 */
public class Collection_Test {
    public static void main(String[] args) {
        testList();
        testSet();
    }
    public static void testList(){
        List list = new ArrayList();
        User user1 = new User("张三",950826,185490309);
        User user2 = new User("李四",960927,185490309);
        User user3 = new User("王五",971028,185490309);
        list.add(user1);
        list.add(user2);
        //list.add(user3);
        System.out.println("判断集合是否为空："+list.isEmpty());
        System.out.println("当前集合元素个数："+list.size());
        //  迭代器遍历
        Iterator<User> iterator = list.iterator();
        while (iterator.hasNext()){
            User user = iterator.next();
            System.out.println(user);
        }
        list.set(1,user3);

//        System.out.println(list);
//        list.remove(list.get(1));
        System.out.println("当前集合元素个数："+list.size());
        System.out.println(list);

    }

    public static void testSet(){
        Set set = new HashSet();
        set.add("张三");
        set.add("李四");
        set.add("王五");
        for (Object o : set) {
            System.out.println(o);
        }
    }
}

class User{
    private String name;
    private long password;
    private double phone;

    public User() {
    }

    public User(String name, long password, double phone) {
        this.name = name;
        this.password = password;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPassword() {
        return password;
    }

    public void setPassword(long password) {
        this.password = password;
    }

    public double getPhone() {
        return phone;
    }

    public void setPhone(double phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password=" + password +
                ", phone=" + phone +
                '}';
    }
}