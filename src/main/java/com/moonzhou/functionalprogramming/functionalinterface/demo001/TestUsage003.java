package com.moonzhou.functionalprogramming.functionalinterface.demo001;

/**
 * Effectively Final 变量
 *
 * @author moon-zhou
 * @date: 2020/4/22 20:00
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class TestUsage003 {

    public static void main(String[] args) {

        /**
         * 近似final 只要一个变量只被赋值一次，那么编译器将会把这个变量看作是effectively final的。
         * localVariable被赋值了两次，从而不是一个Effectively Final 变量，会编译报错
         */
        /*String localVariable = "Local";
        Usage usage = parameter -> {
            localVariable = parameter;
            return localVariable;
        };*/
    }
}
