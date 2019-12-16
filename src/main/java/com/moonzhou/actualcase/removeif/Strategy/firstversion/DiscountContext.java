package com.moonzhou.actualcase.removeif.Strategy.firstversion;

/**
 * 策略上下文
 * 逻辑简单时，该层可以去掉
 *
 * @author moon-zhou
 * @Date: 2019/12/16 16:15
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class DiscountContext {

    private DiscountStrategy discountStrategy;

    public DiscountContext(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double getResult(double money) {
        // 可添加复杂业务逻辑
        return discountStrategy.discount(money);
    }
}
