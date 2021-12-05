package com.springcore;

import com.springcore.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCore {
  public static void main(String[] args){
    System.out.println("Working!!!!");
    ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    Student student1 = (Student) context.getBean("student1");
    System.out.println(student1);
    Student student2 = (Student) context.getBean("student2");
    System.out.println(student2);
    Student student3 = (Student) context.getBean("student3");
    System.out.println(student3);
  }
}
