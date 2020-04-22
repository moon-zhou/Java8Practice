package com.moonzhou.functionalprogramming.functionalinterface.demo001;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author moon-zhou
 * @date: 2020/4/22 19:52
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class TestUsage002 {

    private String value = "Outer scope value";

    public String scopeExperiment() {

        // 在内部类中，会创建一个新的作用域范围，在这个作用域范围之内，你可以定义新的变量，并且可以用this引用它。
        Usage usage = new Usage() {
            String value = "Inner class value";

            @Override
            public String method(String string) {
                return this.value;
            }
        };
        String result = usage.method("");

        // 在Lambda表达式中，并没有定义新的作用域范围，如果在Lambda表达式中使用this，则指向的是外部类。
        Usage usageLambda = parameter -> {
            String value = "Lambda value";
            return this.value;
        };
        String resultLambda = usageLambda.method("");

        return "Results: result = " + result +
                ", resultLambda = " + resultLambda;
    }

    public static void main(String[] args) {

        TestUsage002 testUsage002 = new TestUsage002();
        String result = testUsage002.scopeExperiment();
        System.out.println(result);
    }
}
