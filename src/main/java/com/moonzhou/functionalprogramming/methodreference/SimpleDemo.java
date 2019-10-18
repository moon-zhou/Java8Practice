package com.moonzhou.functionalprogramming.methodreference;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * 〈一句话功能简述〉<br>
 * 方法引用简单的demo
 *
 * @author moon zhou
 * @Date: 2019/10/18 21:08
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class SimpleDemo {
    public static void main(String[] args) {
        // 静态方法引用--通过类名调用
        Consumer<String> consumerStatic = MoonZhou::MyNameStatic;
        consumerStatic.accept("moon zhou static.");

        // 实例方法引用--通过实例调用
        MoonZhou moonZhou = new MoonZhou();
        Consumer<String> consumer = moonZhou::myName;
        consumer.accept("moon zhou instance");

        // 构造方法方法引用--无参数
        Supplier<MoonZhou> supplier = MoonZhou::new;
        System.out.println(supplier.get().attribute);
    }

    static class MoonZhou {

        private String attribute = "handsome boy";

        // 静态方法
        public static void MyNameStatic(String name) {
            System.out.println(name);
        }

        // 实例方法
        public void myName(String name) {
            System.out.println(name);
        }

        // 无参构造方法
        public MoonZhou() {
        }
    }
}
