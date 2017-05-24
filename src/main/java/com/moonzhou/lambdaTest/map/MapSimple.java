package com.moonzhou.lambdaTest.map;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * 可以看到map将集合类（例如列表）元素进行转换的。还有一个 reduce() 函数可以将所有值合并成一个。 Map和Reduce操作是函数式编程的核心操作，因为其功能，reduce 又被称为折叠操作。另外，reduce 并不是一个新的操作，你有可能已经在使用它。 SQL中类似 sum()、avg() 或者 count() 的聚集函数，实际上就是 reduce 操作，因为它们接收多个值并返回一个值。 流API定义的 reduceh() 函数可以接受lambda表达式，并对所有值进行合并。 IntStream这样的类有类似 average()、count()、sum() 的内建方法来做 reduce 操作，也有mapToLong()、mapToDouble() 方法来做转换。 这并不会限制你，你可以用内建方法，也可以自己定义。
 * 
 * @author moon-zhou
 *
 */
public class MapSimple {

    List<Integer> costBeforeTax;

    @Before
    public void initInfo() {
        costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
    }

    @Test
    public void oldEachHandList() {

        Assert.assertNotNull(costBeforeTax);

        for (Integer cost : costBeforeTax) {
            double price = cost + .12 * cost;
            System.out.println(price);
        }
    }

    @Test
    public void newEachHandList() {

        Assert.assertNotNull(costBeforeTax);

        // 使用lambda表达式
        costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        costBeforeTax.stream().map((cost) -> cost + .12 * cost).forEach(System.out::println);

    }

    @Test
    public void oldReduce() {
        // 为每个订单加上12%的税
        // 老方法：
        double total = 0;
        for (Integer cost : costBeforeTax) {
            double price = cost + .12 * cost;
            total = total + price;
        }
        System.out.println("Total : " + total);
    }

    @Test
    public void newReduce() {
        
        // 此处reduce的使用还有疑问，需要进一步例子来理解
        double bill = costBeforeTax.stream().map((cost) -> cost + .12 * cost).reduce((sum, cost) -> sum + cost).get();
        System.out.println("Total : " + bill);
    }

}
