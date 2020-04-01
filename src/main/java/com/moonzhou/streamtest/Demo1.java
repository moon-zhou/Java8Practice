package com.moonzhou.streamtest;

import java.util.ArrayList;
import java.util.List;

/**
 * Stream的一些例子<br>
 * 参考：https://juejin.im/post/5e83fa28e51d4546d23bfd73
 *
 * @author moon-zhou
 * @date: 2020/4/1 20:57
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Demo1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("武汉加油");
        list.add("中国加油");
        list.add("世界加油");
        list.add("世界加油");

        /*
         * 关注点：
         *   1. 链式编程
         *   2. distinct
         *
         * 接口原理：Stream<T> distinct()
         */
        long count = list.stream().distinct().count();
        System.out.println(count);

    }
}
