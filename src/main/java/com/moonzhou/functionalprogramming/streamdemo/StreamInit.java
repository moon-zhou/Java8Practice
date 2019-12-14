package com.moonzhou.functionalprogramming.streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Stream各种初始化方法
 *
 * @author moon zhou
 * @Date: 2019/11/4 23:19
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class StreamInit {
    public static void main(String[] args) {
        // 1.Collection的默认方法stream()和parallelStream()
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> stream = list.stream();// 获取顺序流
        Stream<String> parallelStream = list.parallelStream();

        // 2.Arrays.stream()
        IntStream intStream = Arrays.stream(new int[]{1, 2, 3});
        Stream<Integer> IntegerStream = Arrays.stream(new Integer[]{1, 2, 3});

        // 3.Stream.of()
        Stream<Integer> IntegerStream2 = Stream.of(1, 2, 3, 4);
        IntStream intStream2 = IntStream.of(1, 2, 3);

        // 4.Stream.iterate()//迭代无限流
        // Stream.iterate(1, n->n +1).forEach(System.out::println);
        Stream.iterate(1, n -> n + 1).limit(100).forEach(System.out::println);

        // 5.Stream.generate()//生成无限流
        // Stream.generate(Math::random).forEach(System.out::println);
        Stream.generate(Math::random).limit(2).forEach(System.out::println);
    }
}
