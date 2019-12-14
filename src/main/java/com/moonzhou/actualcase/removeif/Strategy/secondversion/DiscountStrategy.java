package com.moonzhou.actualcase.removeif.Strategy.secondversion;

/**
 * 抽象优惠接口<br>
 * 策略模式
 *
 * @author moon-zhou
 * @Date: 2019/12/14 20:49
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public interface DiscountStrategy {

    /**
     * 优惠抽象方法
     * @param money
     * @return
     */
    double discount(double money);

    /**
     * 返回用户类型
     * @return
     */
    String getUserTypeCode();
}
