/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/8
 * Time : 16:48
 * Description :
 */
public class MyGenericityClass<SS> {
    private SS ss;

    public SS getSs() {
        return ss;
    }

    public void setSs(SS ss) {
        this.ss = ss;
    }

    @Override
    public String toString() {
        return "MyGenericityClass{" +
                "ss=" + ss +
                '}';
    }
}
class Test{
    public static void main(String[] args) {
        MyGenericityClass<String> smg = new MyGenericityClass<>();
        smg.setSs("自定义泛型");
        System.out.println(smg.getSs());
    }
}
