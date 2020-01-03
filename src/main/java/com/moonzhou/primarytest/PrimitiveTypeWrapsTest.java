package com.moonzhou.primarytest;

/**
 * @Description 基础包装类测试
 * @Author moon-zhou <ayimin1989@163.com>
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2019/10/26
 */
public class PrimitiveTypeWrapsTest {

    public static void main(String[] args) {
        Integer i1 = new Integer(3);
        int v1 = i1;

        System.out.println("v1 is: " + v1);

        Integer i2 = null;
        int v2 = i2;
        System.out.println("v2 is: " + v2);
    }
}
