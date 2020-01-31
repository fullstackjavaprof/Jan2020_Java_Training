package com.polymorphism;

class A{  
protected void msg(){System.out.println("Hello java");}  
}  
public class TestOverridingwithAccessModifiers extends A{  
protected void msg(){  //C.T.Error 
	System.out.println("Hello java");
	} 
 public static void main(String args[]){  
	 TestOverridingwithAccessModifiers obj=new TestOverridingwithAccessModifiers();  
   obj.msg();  
   }  
}  

