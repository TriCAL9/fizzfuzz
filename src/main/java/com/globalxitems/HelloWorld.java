package com.globalxitems;
/**
*A Class that prints the Hello World greetings.
*/
public class HelloWorld {
    private String greeting;
    public HelloWorld(String greeting) {
        this.greeting = greeting;
    }
    public static String getGreeting() {
        return greeting;
    }
    public static void main (String[] args) {
        HelloWorld sayHello = new HelloWorld("Hello World!");
        System.out.println(sayHello.getGreeting());
    }
}