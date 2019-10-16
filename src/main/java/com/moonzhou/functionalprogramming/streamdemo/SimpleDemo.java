package com.moonzhou.functionalprogramming.streamdemo;

import java.util.stream.IntStream;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author moon zhou
 * @Date: 2019/10/16 19:36
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class SimpleDemo {
    public static void main(String[] args) {
        traditionalSum(initArrayData());

        streamSum(initArrayData());

        streamParallelSum(initArrayData());
    }

    public static int[] initArrayData() {
        int[] nums = { 1, 2, 3 };
        return nums;
    }

    /**
     * 老的遍历数组处理方式
     * @param nums
     */
    public static void traditionalSum(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }

        System.out.printf("tradition sum result: %d", sum);
        System.out.println();
    }

    /**
     * stream处理数组求和
     * @param nums
     */
    public static void streamSum(int[] nums) {
        int sum = IntStream.of(nums).sum();

        System.out.printf("stream sum result: %d", sum);
        System.out.println();
    }

    /**
     * stream并发处理数组求和
     * @param nums
     */
    public static void streamParallelSum(int[] nums) {
        int sum = IntStream.of(nums).parallel().sum();

        System.out.printf("stream parallel sum result: %d", sum);
        System.out.println();
    }
}
