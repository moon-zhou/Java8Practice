package com.moonzhou.lambdaTest;

import java.util.Arrays;
import java.util.List;

public class ArrayIterationSimple {

    public static void main(String[] args) {
        oldIteration();
        
        newIteration();
    }

    public static void oldIteration() {
        System.out.println("old iteration");
        
        List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");

        for (String feature : features) {
            System.out.println(feature);
        }
    }

    public static void newIteration() {
        System.out.println("new iteration");
        
        List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        features.forEach(n -> System.out.println(n));
    }
}
