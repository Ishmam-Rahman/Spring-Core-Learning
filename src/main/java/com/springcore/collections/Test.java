package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
  public static void main(String[] args){
    ApplicationContext context = new ClassPathXmlApplicationContext("collectionConfig.xml");
    Students student1 = (Students) context.getBean("studentsList");
    System.out.println(student1.getNames());
    System.out.println(student1.getRolls());
    System.out.println(student1.getMap());
  }
}
