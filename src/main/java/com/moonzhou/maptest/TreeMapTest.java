package com.moonzhou.maptest;

import com.alibaba.fastjson.JSON;

import java.util.Map;
import java.util.TreeMap;

/**
 * @Description
 * @Author moon-zhou <ayimin1989@163.com>
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2019/10/20
 */
public class TreeMapTest {

    public static void main(String[] args) {
        Map<Long, String> moon = new TreeMap();

        moon.put(1L, "moon1");
        moon.put(5L, "moon5");
        moon.put(3L, "moon3");
        moon.put(2L, "moon2");
        moon.put(4L, "moon4");

        System.out.println(JSON.toJSONString(moon));
    }
}
