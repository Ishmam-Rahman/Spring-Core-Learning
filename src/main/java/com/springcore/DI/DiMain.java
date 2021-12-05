package com.springcore.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiMain {
  public static void main(String[] args){
    ApplicationContext context = new ClassPathXmlApplicationContext("DiConfig.xml");
    A a = (A) context.getBean("A");
    System.out.println(a);

    A aa = (A) context.getBean("AA");
    System.out.println(aa);

    A aaa = (A) context.getBean("AAA");
    System.out.println(aaa);
  }
}
