package com.javatraining.basics;

class Vehicle{
	  //defining a method  
	  void run(){
		  System.out.println("Vehicle is running");
	  	}  
	}  
	//Creating a child class  
	class Bike2 extends Vehicle{  
	  //defining the same method as in the parent class  
	  void run(){
		  System.out.println("Bike is running safely");
		  }  
	 
	  public static void main(String args[]){  
		  Vehicle obj = new Vehicle();//creating object  
	  obj.run();//calling method 
	  Bike2 bike2=new Bike2();
	  bike2.run();
	  }  
	} 
