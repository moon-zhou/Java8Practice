package com.moonzhou.lambdaTest;

import java.util.concurrent.TimeUnit;

/**
 * 
 * @author moon-zhou
 *
 */
public class ThreadSimple {

    public static void main(String[] args) throws Exception {
        normalThread();
        
        newThread();
    }

    public static void normalThread() throws InterruptedException {

        new Thread(new Runnable() {
            public void run() {
                System.out.println("Hello Old World!");
            }
        }).start();

        TimeUnit.SECONDS.sleep(5);
        
        System.out.println("Good Bye Old World!");
    }

    public static void newThread() throws InterruptedException {
        new Thread(() -> System.out.println("Hello New World!")).start();
        
        TimeUnit.SECONDS.sleep(5);
        
        System.out.println("Good Bye New World!");
    }
}
