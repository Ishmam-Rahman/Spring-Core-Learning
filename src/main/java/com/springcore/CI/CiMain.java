package com.springcore.CI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CiMain {
  public static void main(String[] args){
    ApplicationContext context = new ClassPathXmlApplicationContext("CiConfig.xml");

    Me me = (Me) context.getBean("me");

    System.out.println(me);
  }
}
