package com.collections;

import java.util.*;  
public class TestJavaCollectionStack{  
	public static void main(String args[]){  
		Stack<String> stack = new Stack<String>();  
		stack.push("Ayush");  
		stack.push("Ravi");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Ajay");  
		//stack.pop();  
	//	System.out.println(stack.pop());
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}  
} 