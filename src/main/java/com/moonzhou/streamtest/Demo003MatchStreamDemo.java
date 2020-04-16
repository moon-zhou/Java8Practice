package com.moonzhou.streamtest;

import java.util.ArrayList;
import java.util.List;

/**
 * Stream操作了demo：匹配<br>
 * https://juejin.im/post/5e83fa28e51d4546d23bfd73
 * 〈功能详细描述〉
 *
 * @author moon-zhou
 * @date: 2020/4/3 08:53
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Demo003MatchStreamDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("周杰伦");
        list.add("王力宏");
        list.add("陶喆");
        list.add("林俊杰");

        boolean anyMatchFlag = list.stream().anyMatch(element -> element.contains("王"));
        boolean allMatchFlag = list.stream().allMatch(element -> element.length() > 1);
        boolean noneMatchFlag = list.stream().noneMatch(element -> element.endsWith("沉"));
        System.out.println(anyMatchFlag);
        System.out.println(allMatchFlag);
        System.out.println(noneMatchFlag);
    }
}
