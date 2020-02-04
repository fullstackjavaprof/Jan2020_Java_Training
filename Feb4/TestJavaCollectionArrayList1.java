package com.collections;

import java.util.*;
import java.util.Iterator;  

class TestJavaCollectionArrayList1{  
public static void main(String args[]){  
	
//int a[] = new int[10];
 
	ArrayList<Object> list=new ArrayList<Object>();//Creating arraylist  
	list.add("Ravi");//Adding object in arraylist  
	list.add(12);  
	list.add(23.78f);  
	//list.set(2, 'c'); // Replaces the element at the specified position in this list with the specified element.
	list.add(1, 1000); // Inserts the specified element at the specified position in this list.
	//System.out.println(list.get(2));

  
//Traversing list through Iterator  
Iterator itr=list.iterator();  

	while(itr.hasNext()){  
	System.out.println(itr.next());  
	 }  
	}  
}



