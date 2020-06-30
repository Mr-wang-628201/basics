package com.basics.designmode.agency;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/27
 * Time : 1:06
 * Description : 动态的创建代理对象
 */
public class ProxyInvocationHandler implements InvocationHandler {

    private Object object;

    public void setObject(Object object) {
        this.object = object;
    }

    public Object getProxy(){
        /**
         * 参数
         * loader - 类加载器来定义代理类
         * interfaces - 代理类实现的接口列表
         * h - 调度方法调用的调用处理函数
         * 结果
         * 具有由指定的类加载器定义并实现指定接口的代理类的指定调用处理程序的代理实例
         */
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
    }

    /**
     *
     * @param proxy - 调用该方法的代理实例
     * @param method -所述方法对应于调用代理实例上的接口方法的实例。
     *              方法对象的声明类将是该方法声明的接口，它可以是代理类继承该方法的代理接口的超级接口。
     * @param args -包含的方法调用传递代理实例的参数值的对象的阵列，或null如果接口方法没有参数。
     *            原始类型的参数包含在适当的原始包装器类的实例中，例如java.lang.Integer或java.lang.Boolean 。
     * @return 从代理实例上的方法调用返回的值。
     *          如果接口方法的声明返回类型是原始类型，则此方法返回的值必须是对应的基本包装类的实例;
     *          否则，它必须是可声明返回类型的类型。
     *          如果此方法返回的值是null和接口方法的返回类型是基本类型，那么NullPointerException将由代理实例的方法调用抛出。
     *          如上所述，如果此方法返回的值，否则不会与接口方法的声明的返回类型兼容，一个ClassCastException将代理实例的方法调用将抛出。
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String name = method.getName();
        System.out.println("调用的方法的名称： "+name);
        Object invoke = method.invoke(object, args);
        System.out.println("对动态生成的对象进行增强。。。");
        return invoke;
    }
}
