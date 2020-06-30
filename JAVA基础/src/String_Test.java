/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/6
 * Time : 15:06
 * Description :
 */
public class String_Test {
    public static void main(String[] args) {
        String str = "好好学习天天向上";
        String str1 = "好好学习天天向上";
        String str2 = new String("好好学习天天向上");
        System.out.println(str==str1);
        System.out.println(str==str2);

        char c = str.charAt(2);
        System.out.println(c);

        byte bytes[] = {97,98,99};
        System.out.println(new String(bytes));

        /**
         *  public int length () ：返回此字符串的长度。
         *  public String concat (String str) ：将指定的字符串连接到该字符串的末尾。
         *  public char charAt (int index) ：返回指定索引处的 char值。
         *  public int indexOf (String str) ：返回指定子字符串第一次出现在该字符串内的索引。
         *  public String substring (int beginIndex) ：返回一个子字符串，从beginIndex开始截取字符串到字符 串结尾。
         *  public String substring (int beginIndex, int endIndex) ：返回一个子字符串，从beginIndex到 endIndex截取字符串。含beginIndex，不含endIndex。
         */
        System.out.println(str.indexOf("天天"));
        System.out.println(str.substring(3));
        System.out.println(str.substring(3,6));
        //public char[] toCharArray () ：将此字符串转换为新的字符数组。
        char[] array = str.toCharArray();
        for (char c1 : array) {
            System.out.print("  "+c1);
        }
        System.out.println();

        //public String replace (CharSequence target, CharSequence replacement) ：
        // 将与target匹配的字符串使 用replacement字符串替换。
        String replace = str1.replace("向上", "向下");
        System.out.println(replace);
    }
}
class StringBuilder_Test{
    public static void main(String[] args) {
        StringBuilder sbd = new StringBuilder("Hello");
        //  在后面拼接字符串
        sbd.append(" World");
        System.out.println(sbd);
        //  转为 String 类型
        String s = sbd.toString();
        System.out.println(s);
        String s1 = "5";
        try{
            int i = Integer.parseInt(s1);
            System.out.println("int："+i);
            byte b = Byte.parseByte(s1);
            System.out.println("byte："+b);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
class StringBuffer_Test{
    public static void main(String[] args) {
        //  线程安全的
        StringBuffer sbf = new StringBuffer("线程安全的");
        sbf.append("字符串类型");
        System.out.println(sbf);
        String s = sbf.toString();
        System.out.println(s);

    }
}
