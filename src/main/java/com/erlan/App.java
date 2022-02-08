package com.erlan;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person1 = context.getBean("person1",Person.class);
        Person person2 = context.getBean("person2",Person.class);
        System.out.println("----------------------- Person 1 ----------------------------");
        System.out.println("\u001B[31m"+person1);
        System.out.println("\u001B[34m Pros : " + person1.getAnymal().anymalPlus()+"\u001B[0m");
        System.out.println("\u001B[35m Minuses : " + person1.getAnymal().anymalMinus()+"\u001B[0m");
        System.out.println("------------------------ Person 2 ---------------------------------");
        System.out.println("\u001B[33m"+person2);
        System.out.println("\u001B[32m Pros : " + person2.getAnymal().anymalPlus()+"\u001B[0m");
        System.out.println("\u001B[36m Minuses : " + person2.getAnymal().anymalMinus());
        context.close();
    }
}
