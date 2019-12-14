package com.moonzhou.actualcase.removeif.Strategy.secondversion;

import com.moonzhou.actualcase.removeif.Strategy.secondversion.DiscountStrategy;
import com.moonzhou.actualcase.removeif.UserType;

/**
 * 白银会员优惠实现
 *
 * @author moon-zhou
 * @Date: 2019/12/14 20:53
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class SilverStrategy implements DiscountStrategy {
    /**
     * 优惠抽象方法
     *
     * @param money
     * @return
     */
    @Override
    public double discount(double money) {
        System.out.println("白银会员，优惠￥50");

        return money - 50;
    }

    /**
     * 返回用户类型
     *
     * @return
     */
    @Override
    public String getUserTypeCode() {
        return UserType.SILVER_VIP.getCode();
    }
}
