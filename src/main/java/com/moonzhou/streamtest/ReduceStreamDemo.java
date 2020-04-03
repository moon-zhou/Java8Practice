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
public class ReduceStreamDemo {
    public static void main(String[] args) {
        Integer[] ints = {0, 1, 2, 3};
        List<Integer> list = Arrays.asList(ints);

        Optional<Integer> optional = list.stream().reduce((a, b) -> a + b);
        Optional<Integer> optional1 = list.stream().reduce(Integer::sum);
        System.out.println(optional.orElse(0));
        System.out.println(optional1.orElse(0));

        int reduce = list.stream().reduce(6, (a, b) -> a + b);
        System.out.println(reduce);
        int reduce1 = list.stream().reduce(6, Integer::sum);
        System.out.println(reduce1);
    }
}
