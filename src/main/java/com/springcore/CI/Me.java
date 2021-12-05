package com.springcore.CI;

public class Me {
  private String name;
  private You age;

  public Me(String name, You age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Me{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
