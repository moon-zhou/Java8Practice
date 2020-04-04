package com.moonzhou.streamtest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * 流操作相关demo: 过滤<br>
 * https://juejin.im/post/5e83fa28e51d4546d23bfd73
 *
 * @author moon-zhou
 * @date: 2020/4/2 12:01
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class FilterStreamDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("周杰伦");
        list.add("王力宏");
        list.add("陶喆");
        list.add("林俊杰");

        // filter() 方法接收的是一个 Predicate（Java 8 新增的一个函数式接口，接受一个输入参数返回一个布尔值结果）类型的参数
        Stream<String> stream = list.stream().filter(element -> element.contains("周"));

        // forEach() 方法接收的是一个 Consumer（Java 8 新增的一个函数式接口，接受一个输入参数并且无返回的操作）类型的参数，类名 :: 方法名是 Java 8 引入的新语法
        stream.forEach(System.out::println);
    }
}
