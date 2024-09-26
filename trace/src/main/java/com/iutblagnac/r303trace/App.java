package com.iutblagnac.r303trace;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        System.out.println(hello());
        System.out.println(goodbye());
    }

    public static String hello() {
        return "Hello World!";
    }

    public static String goodbye() {
        return "See you World !";
    }

    public static String hello(String param) {
        return param;
    }

    public static String goodbye(String param) {
        return param;
    }

}
