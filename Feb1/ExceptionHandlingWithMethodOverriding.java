package com.polymorphism;

import java.io.*;  

class Parent{  
  void msg(){
	  System.out.println("parent");
	  }  
}  
 
class ExceptionHandlingWithMethodOverriding extends Parent{  
	void msg()throws ArithmeticException{    // no error because this is runtime exception
	 //	  void msg() throws IOException {  // compile time error because this is compile time exception

    System.out.println("TestExceptionChild");  
  }  
  public static void main(String args[]){  
ExceptionHandlingWithMethodOverriding e=new ExceptionHandlingWithMethodOverriding();  
   e.msg();  
  }  
}

