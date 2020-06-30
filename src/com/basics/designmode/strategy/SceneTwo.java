package com.basics.designmode.strategy;

/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/26
 * Time : 12:01
 * Description :
 */
public class SceneTwo implements Strategy {
    @Override
    public void Operate() {
        System.out.println("求吴国太开个绿灯，放行");
    }
}
