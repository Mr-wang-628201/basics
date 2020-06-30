package com.basics.designmode.agency;

/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/27
 * Time : 1:47
 * Description :
 */
public class Test {

    public static void main(String[] args) {
        //  创建实例对象
        System.out.println("------------------- 创建实例对象 -------------------");
        ExploitEmployee exploitEmployee = new ExploitEmployee();
        exploitEmployee.JobDuties();
        System.out.println("------------------- 创建代理对象 -------------------");
        //  创建代理对象
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setObject(exploitEmployee);
        Employee employee = (Employee)proxyInvocationHandler.getProxy();
        employee.JobDuties();
    }
}
