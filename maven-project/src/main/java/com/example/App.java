package com.example;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        String str = "Hello world!";
        System.out.println(str);
        System.out.println(StringUtils.reverse(str));
        MyClass myClass = new MyClass();
        myClass.someMethod();
    }
}
