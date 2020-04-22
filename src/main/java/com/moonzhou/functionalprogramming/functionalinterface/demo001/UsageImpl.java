package com.moonzhou.functionalprogramming.functionalinterface.demo001;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author moon-zhou
 * @date: 2020/4/22 19:33
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class UsageImpl implements Usage {
    @Override
    public String method(String string) {

        return "pre1 ".concat(string);
    }
}
