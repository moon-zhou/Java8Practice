package com.moonzhou.functionalprogramming.simpledemo;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author moon-zhou
 * @Date: 2019/10/4 11:48
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Demo1 {
    public static void main(String[] args) throws InterruptedException {

        // 用匿名内部类的方式来创建线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello, handsome boy. Traditional thread");
            }
        }).start();

        // 使用Lambda来创建线程
        new Thread(() -> System.out.println("hello, handsome boy. Latest thread.")).start();

    }
}
