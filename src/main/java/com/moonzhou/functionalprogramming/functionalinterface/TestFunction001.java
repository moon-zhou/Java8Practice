package com.moonzhou.functionalprogramming.functionalinterface;

import java.util.function.Function;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author moon-zhou
 * @date: 2020/4/22 19:57
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class TestFunction001 {
    public static void main(String[] args) {

    }

    public String test2(String string, Function<String, String> fn) {
        return fn.apply(string);
    }
}
