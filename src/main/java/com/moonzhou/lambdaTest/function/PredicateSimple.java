package com.moonzhou.lambdaTest.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 
 * @author moon-zhou
 *
 */
public class PredicateSimple {

    public static void main(String[] args) {
        String[] languageArray = { "Java", "Scala", "C++", "Haskell", "Lisp" };
        List<String> languages = Arrays.asList(languageArray);

        testNormalFilter(languages);

        System.out.println("-------------------------");

        testBetterFilter(languages);
        
        System.out.println("-------------------------");
        
        fiterMoreCondition(languages);
    }

    private static void testNormalFilter(List<String> languages) {
        System.out.println("Languages which starts with J :");
        filter(languages, (str) -> ((String) str).startsWith("J"));

        System.out.println("Languages which ends with a ");
        filter(languages, (str) -> ((String) str).endsWith("a"));

        System.out.println("Print all languages :");
        filter(languages, (str) -> true);

        System.out.println("Print no language : ");
        filter(languages, (str) -> false);

        System.out.println("Print language whose length greater than 4:");
        filter(languages, (str) -> ((String) str).length() > 4);
    }

    public static void testBetterFilter(List<String> languages) {
        System.out.println("Languages which starts with J :");
        filterBetter(languages, (str) -> ((String) str).startsWith("J"));

        System.out.println("Languages which ends with a ");
        filterBetter(languages, (str) -> ((String) str).endsWith("a"));

        System.out.println("Print all languages :");
        filterBetter(languages, (str) -> true);

        System.out.println("Print no language : ");
        filterBetter(languages, (str) -> false);

        System.out.println("Print language whose length greater than 4:");
        filterBetter(languages, (str) -> ((String) str).length() > 4);
    }

    public static void filter(List<String> names, Predicate<String> condition) {
        for (String name : names) {
            if (condition.test(name)) {
                System.out.println(name + " ");
            }
        }
    }

    // 更好的办法
    /**
     * 可以看到，Stream API的过滤方法也接受一个Predicate，这意味着可以将我们定制的 filter() 方法替换成写在里面的内联代码，这就是lambda表达式的魔力。 另外，Predicate接口也允许进行多重条件的测试，下个例子将要讲到。
     * 
     * @param names
     * @param condition
     */
    public static void filterBetter(List<String> names, Predicate<String> condition) {
        names.stream().filter((name) -> (condition.test(name))).forEach((name) -> {
            System.out.println(name + " ");
        });
    }

    public static void fiterMoreCondition(List<String> names) {
        // 甚至可以用and()、or()和xor()逻辑函数来合并Predicate，
        // 例如要找到所有以J开始，长度为四个字母的名字，你可以合并两个Predicate并传入
        Predicate<String> startsWithJ = (n) -> n.startsWith("J");
        Predicate<String> fourLetterLong = (n) -> n.length() == 4;
        names.stream().filter(startsWithJ.and(fourLetterLong))
            .forEach((n) -> System.out.print("nName, which starts with 'J' and four letter long is : " + n));
    }
}
