package com.moonzhou.functionalprogramming.streamdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 〈一句话功能简述〉<br>
 * 分步使用stream
 *
 * @author moon zhou
 * @Date: 2019/10/16 20:02
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class StreamStepUsingDemo {

    public static void main(String[] args) {


        streamOperato();
    }

    /**
     * 创建流
     */
    public static void initStream() {
        List<String> list = new ArrayList<>();
        // 从集合创建
        Stream<String> stream = list.stream();
        Stream<String> stream1 = list.parallelStream();

        // 从数组创建
        IntStream stream2 = Arrays.stream(new int[]{2, 3, 5});

        // 创建数字流
        IntStream intStream = IntStream.of(1, 2, 3);

        // 使用random创建
        IntStream limit = new Random().ints().limit(10);

    }

    /**
     * 执行中间操作
     */
    public static void streamOperato() {
        String str = "my name is 007";


        Stream.of(str.split(" ")) // 从字符串数组创建出流对象
                .filter(s -> s.length() > 2) // 通过流对象的API执行中间操作(filter)，返回的还是流对象
                .map(s -> s.length()) // 通过返回的流对象再执行中间操作(map)，返回的还是流对象，从而可以进行链式操作
                .forEach(System.out::println); // 没有这一步更能说明
    }

    /**
     * Stream上的操作并不会立即执行，只有等到用户真正需要结果的时候才会执行（惰性求值）。
     */
    public static void streamFinalOperato() {
        String str = "my name is 007";
        Stream.of(str.split(" "))
                .peek(System.out::println) // peek()是一个中间操作，返回的是Stream流对象，只要它不执行最终的操作，这个Stream是不会执行的。
                .forEach(System.out::println);
    }

}
