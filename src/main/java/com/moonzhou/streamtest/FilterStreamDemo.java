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
        Stream<String> stream = list.stream().filter(element -> element.contains("周"));
        stream.forEach(System.out::println);
    }
}
