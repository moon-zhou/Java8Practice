package com.moonzhou.actualcase.removeif.Strategy.firstversion;

/**
 * 白金会员优惠方法
 *
 * @author moon-zhou
 * @Date: 2019/12/14 21:02
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class PlatinumStrategy implements DiscountStrategy {
    /**
     * 优惠抽象方法
     *
     * @param money
     * @return
     */
    @Override
    public double discount(double money) {
        System.out.println("白金会员，优惠50元，再打7折");
        return (money - 50) * 0.7;
    }
}
