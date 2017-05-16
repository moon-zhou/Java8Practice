package com.moonzhou.lambdaTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArrayIterationSimple {

    public static void main(String[] args) {
        /*oldIteration();

        newIteration();*/
        
        oldSortIteration();
        
        System.out.println("------");
        
        newSortIteration();
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

    public static void oldSortIteration() {
        String[] datas = new String[] { "peng", "zhao", "li" };
        Arrays.sort(datas);
        
        Stream.of(datas).forEach(param -> System.out.println(param));
    }
    
    public static void newSortIteration() {
        String []datas = new String[] {"peng","zhao","li"};
        Arrays.sort(datas,(v1 , v2) -> Integer.compare(v1.length(), v2.length()));
        
        Stream.of(datas).forEach(param -> System.out.println(param));
    }
}
