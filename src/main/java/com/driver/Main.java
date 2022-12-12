package com.driver;

public class Main {
  public static void main(String[] args ){
      RWOnly obj = new RWOnly();
//      obj.name = "abc";
//      System.out.println( obj.name );
      obj.setters("abc");
      System.out.println( obj.getter() );
  }
}