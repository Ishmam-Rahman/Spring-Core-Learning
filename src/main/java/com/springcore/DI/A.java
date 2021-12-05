package com.springcore.DI;

public class A {
  private int x;
  private B ob;

  public A(int x, B ob) {
    this.x = x;
    this.ob = ob;
  }

  public A() {
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setOb(B ob) {
    this.ob = ob;
  }

  public int getX() {
    return x;
  }

  public B getOb() {
    return ob;
  }

  @Override
  public String toString() {
    return "A{" +
        "x=" + x +
        ", ob=" + ob +
        '}';
  }
}
