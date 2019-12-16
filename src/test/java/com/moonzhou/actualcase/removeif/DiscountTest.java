package com.moonzhou.actualcase.removeif;

import org.junit.Test;

/**
 * 测试打折方法<br>
 *
 * @author moon-zhou
 * @Date: 2019/12/14 20:54
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class DiscountTest {

    @Test
    public void testIf() {
        double money = 8888;
        System.out.println(DiscountContext.getDiscountPriceByIf(money, UserType.NORMAL.getCode()));
        System.out.println(DiscountContext.getDiscountPriceByIf(money, UserType.SILVER_VIP.getCode()));
        System.out.println(DiscountContext.getDiscountPriceByIf(money, UserType.GOLD_VIP.getCode()));
        System.out.println(DiscountContext.getDiscountPriceByIf(money, UserType.PLATINUM_VIP.getCode()));
    }

    @Test
    public void testIfStrategy() {
        double money = 8888;
        System.out.println(DiscountContext.getDiscountPriceByIfStrategy(money, UserType.NORMAL.getCode()));
        System.out.println(DiscountContext.getDiscountPriceByIfStrategy(money, UserType.SILVER_VIP.getCode()));
        System.out.println(DiscountContext.getDiscountPriceByIfStrategy(money, UserType.GOLD_VIP.getCode()));
        System.out.println(DiscountContext.getDiscountPriceByIfStrategy(money, UserType.PLATINUM_VIP.getCode()));
    }

    @Test
    public void testStreamStrategy() {
        double money = 8888;
        System.out.println(DiscountContext.getDiscountPriceByStreamStrategy(money, UserType.NORMAL.getCode()));
        System.out.println(DiscountContext.getDiscountPriceByStreamStrategy(money, UserType.SILVER_VIP.getCode()));
        System.out.println(DiscountContext.getDiscountPriceByStreamStrategy(money, UserType.GOLD_VIP.getCode()));
        System.out.println(DiscountContext.getDiscountPriceByStreamStrategy(money, UserType.PLATINUM_VIP.getCode()));
    }
}