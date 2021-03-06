package com.moonzhou.actualcase.removeif.Strategy.firstversion;

/**
 * 普通会员优惠计算规则<br>
 *
 * @author moon-zhou
 * @Date: 2019/12/14 20:51
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class OrdinaryStrategy implements DiscountStrategy {

    /**
     * 优惠抽象方法
     *
     * @param money
     * @return
     */
    @Override
    public double discount(double money) {
        System.out.println("普通会员，不打折");

        return money;
    }
}
