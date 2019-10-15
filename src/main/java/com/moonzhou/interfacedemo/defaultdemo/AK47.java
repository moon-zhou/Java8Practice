package com.moonzhou.interfacedemo.defaultdemo;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author moon-zhou
 * @Date: 2019/10/15 19:33
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class AK47 implements Weapon {
    @Override
    public void showName() {
        System.out.println("This is AK47.");
    }

    @Override
    public void shoot() {
        System.out.println("AK47 shoot...");
    }
}
