package com.moonzhou.streamtest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Stream操作了demo：组合<br>
 * https://juejin.im/post/5e83fa28e51d4546d23bfd73
 * 〈功能详细描述〉
 *
 * @author moon-zhou
 * @date: 2020/4/3 08:58
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Demo004ReduceStreamDemo {
    public static void main(String[] args) {
        Integer[] ints = {0, 1, 2, 3};
        List<Integer> list = Arrays.asList(ints);

        /**
         * reduce() 方法的主要作用是把 Stream 中的元素组合起来，它有两种用法：
         * 1. 没有起始值，只有一个参数，就是运算规则，此时返回 Optional。
         * <code>Optional<T> reduce(BinaryOperator<T> accumulator)</code>
         *
         * 2. 有起始值，有运算规则，两个参数，此时返回的类型和起始值类型一致。
         * <code>T reduce(T identity, BinaryOperator<T> accumulator)</code>
         *
         * 运算规则可以是Lambda表达式，也可以使是类名::方法名
         */
        Optional<Integer> optional = list.stream().reduce((a, b) -> a + b);
        System.out.println(optional.orElse(0));
        Optional<Integer> optional1 = list.stream().reduce(Integer::sum);
        System.out.println(optional1.orElse(0));

        int reduce = list.stream().reduce(6, (a, b) -> a + b);
        System.out.println(reduce);
        int reduce1 = list.stream().reduce(6, Integer::sum);
        System.out.println(reduce1);
    }
}
