package com.moonzhou.interfacedemo.defaultdemo;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author moon-zhou
 * @Date: 2019/10/15 19:34
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Test {

    public static void main(String[] args) {
        Weapon ak47 = new AK47();
        ak47.showName();
        ak47.shoot();

        Weapon m4 = new M4();
        m4.showName();
        m4.shoot();

        Weapon m4a1 = new M4A1();
        m4a1.showName();
        m4a1.shoot();
    }
}
