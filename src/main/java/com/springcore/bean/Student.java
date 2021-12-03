package com.springcore.bean;

public class Student {
  private String name;
  private int roll;

  public String getName() {
    return name;
  }

  public int getRoll() {
    return roll;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setRoll(int roll) {
    this.roll = roll;
  }

  public Student(String name, int roll) {
    super();
    this.name = name;
    this.roll = roll;
  }
  public Student(){
    super();
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", roll=" + roll +
        '}';
  }
}
