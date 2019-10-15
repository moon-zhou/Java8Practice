package com.moonzhou.interfacedemo.demo1;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author moon-zhou
 * @Date: 2019/10/15 12:47
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Boy implements People {
    @Override
    public void run() {
        System.out.println("boy run...");
    }

    @Override
    public void eat() {
//    public void eat() throws Exception { // compile error,只能在接口上进行throw
        System.out.println("boy eay...");
    }

    @Override
    public void sleep() {
        //throw new RuntimeException("111");
        System.out.println("super interface has thrown exception...");
    }
}
