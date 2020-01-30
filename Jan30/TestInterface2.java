package com.javatraining.basics;

interface Bank1{  
    	float rateOfInterest();  
    }  
    class SBI1 implements Bank1{  
    	public float rateOfInterest(){
    		return 9.15f;
    	}
    	  
    }  
    class PNB1 implements Bank1{  
    	public float rateOfInterest(){
    		return 9.7f;
    		}  
    }  
    class TestInterface2{  
    public static void main(String[] args){  
	    Bank1 b;  
	    b=new SBI1();
	    System.out.println("ROI: "+b.rateOfInterest());  
	    Bank1 b1;  
	    b1=new PNB1();
	    System.out.println("ROI: "+b1.rateOfInterest());  
	  }
    } 
