package com.moonzhou.functionalprogramming.functionalinterface.demo001;

import java.util.function.Function;

/**
 * 函数式编程基本使用<br>
 *     https://juejin.im/post/5e9e2d886fb9a03c6d3db3e3
 *
 * @author moon-zhou
 * @date: 2020/4/22 19:21
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class TestUsage001 {

    public static void main(String[] args) {
        Usage usage = new UsageImpl();

        TestUsage001 testUsage = new TestUsage001();
        String result1 = testUsage.test1("hello1", usage);
        System.out.println(result1);

        String result2 = testUsage.test1("hello2", new Usage() {
            @Override
            public String method(String string) {
                return "pre2 ".concat(string);
            }
        });
        System.out.println(result2);

        String result3 = testUsage.test2("hello3", param -> "pre3 ".concat(param));
        System.out.println(result3);
    }

    /**
     * 利用多态进行调用，但同时限定了必须是实现了Usage接口的类
     * @param string
     * @param usage
     * @return
     */
    public String test1(String string, Usage usage) {
        return usage.method(string);
    }

    /**
     * 方法调用符合函数式接口即可，功能更加通用
     *
     * test2和test1方法名进行区分是因为两个方法两个参数都是Functional Interface，都可以用同样的lambda表达式来表示
     * 在main方法里，用result3的方法是去调用时，则会编译报错，不知道是调用test1还是test2，因此需要将方法命名为不同，加以区分
     * @param string
     * @param fn
     * @return
     */
    public String test2(String string, Function<String, String> fn) {
        return fn.apply(string);
    }
}
