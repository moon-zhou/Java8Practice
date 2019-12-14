package com.moonzhou.actualcase.removeif;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author moon-zhou
 * @Date: 2019/12/14 20:32
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public enum UserType {
    /**
     * 白银
     */
    SILVER_VIP("001"),

    /**
     * 黄金
     */
    GOLD_VIP("002"),

    /**
     * 白金
     */
    PLATINUM_VIP("003"),

    NORMAL("004"),

    ;

    private String code;

    UserType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
