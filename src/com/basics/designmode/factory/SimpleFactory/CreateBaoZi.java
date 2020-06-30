package com.basics.designmode.factory.SimpleFactory;

/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/26
 * Time : 0:37
 * Description : 创建包子的简单工厂类
 */
public class CreateBaoZi {

    private CreateBaoZi() {
    }

    public static BaoZi getBaoZi(String type){
        BaoZi baoZi = null;
        if (type != null){
            if(type == "DouSa"){
                baoZi = new DouSaBaoZi();
            }else if (type == "Rou"){
                baoZi = new RouBaoZi();
            }
            baoZi.pi();
            baoZi.xian();
            baoZi.xingzhuang();

        }
        return baoZi;
    }
}
