package com.moonzhou.streamtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 转换流，即将流转换为集合或者数组,collect()方法的使用
 * Collectors 是一个收集器的工具类，内置了一系列收集器实现，比如说 toList() 方法将元素收集到一个新的 java.util.List 中；
 * 比如说 toCollection() 方法将元素收集到一个新的 java.util.ArrayList 中；
 * 比如说 joining() 方法将元素收集到一个可以用分隔符指定的字符串中。
 * <p>
 * https://juejin.im/post/5e83fa28e51d4546d23bfd73
 *
 * @author moon-zhou <ayimin1989@163.com>
 * @version V1.0.0
 * @description
 * @date 2020/4/4 22:08
 * @since 1.0
 */
public class Demo005CollectStreamDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("周杰伦");
        list.add("王力宏");
        list.add("陶喆");
        list.add("林俊杰");

        String[] strArray = list.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(strArray));

        List<Integer> list1 = list.stream().map(String::length).collect(Collectors.toList());
        List<String> list2 = list.stream().collect(Collectors.toCollection(ArrayList::new));
        System.out.println(list1);
        System.out.println(list2);

        String str = list.stream().collect(Collectors.joining(", ")).toString();
        System.out.println(str);

    }
}
