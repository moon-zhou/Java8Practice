package com.moonzhou.streamtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author moon-zhou
 * @date: 2020/4/1 21:00
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Demo000CreateStreamDemo {
    public static void main(String[] args) {
        String[] arr = new String[]{"武汉加油", "中国加油", "世界加油"};

        // 数组的话，可以使用 Arrays.stream() 或者 Stream.of() 创建流
        Stream<String> stream = Arrays.stream(arr);
        stream.forEach(System.out::println);

        // 查看 Stream 源码的话，你会发现 of() 方法内部其实调用了 Arrays.stream() 方法
        stream = Stream.of("武汉加油1", "中国加油1", "世界加油1");
        stream.forEach(System.out::println);

        // 集合的话，可以直接使用 stream() 方法创建流，因为该方法已经添加到 Collection 接口中
        // 集合还可以调用 parallelStream() 方法创建并发流，默认使用的是 ForkJoinPool.commonPool()线程池
        List<String> list = new ArrayList<>();
        list.add("武汉加油2");
        list.add("中国加油2");
        list.add("世界加油2");
        stream = list.stream();
        stream.forEach(System.out::println);
    }
}
