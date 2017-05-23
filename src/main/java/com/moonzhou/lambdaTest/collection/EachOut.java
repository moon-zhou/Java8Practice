package com.moonzhou.lambdaTest.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EachOut {
    
    List<String> features = new ArrayList<String>();
    
    @Before
    public void initInfos() {
        features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
    }

    @Test
    public void oldEach() {
        
        Assert.assertNotNull(features);
        
        for (String feature : features) {
            Assert.assertNotNull(feature);

            System.out.println(feature);
        }

    }

    @Test
    public void newEach() {
        
        Assert.assertNotNull(features);
        
        // Java 8之后：
        features.forEach(n -> System.out.println(n));
         
        // 使用Java 8的方法引用更方便，方法引用由::双冒号操作符标示，
        // 看起来像C++的作用域解析运算符
        features.forEach(System.out::println);
    }

}
