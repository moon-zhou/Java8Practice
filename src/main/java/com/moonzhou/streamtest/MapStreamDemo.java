package com.moonzhou.streamtest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Stream操作流demo：映射<br>
 *     https://juejin.im/post/5e83fa28e51d4546d23bfd73
 * 〈功能详细描述〉
 *
 * @author moon-zhou
 * @date: 2020/4/3 08:48
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class MapStreamDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("周杰伦");
        list.add("王力宏");
        list.add("陶喆");
        list.add("林俊杰");
        Stream<Integer> stream = list.stream().map(String::length);
        stream.forEach(System.out::println);
    }
}
