package com.moonzhou;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(false && false || true);

        System.out.println(false && true || false);

        System.out.println(false || true && false);

        System.out.println(false && false || true || false);

        System.out.println(false && false || true || false
        && false );
    }
}
