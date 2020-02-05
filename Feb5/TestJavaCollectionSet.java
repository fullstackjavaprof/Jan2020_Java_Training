package com.collections;
import java.util.*;  
public class TestJavaCollectionSet{  
	public static void main(String args[]){  
	//Creating HashSet and adding elements  
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();  
		set.add(20); 
		set.add(40);  
		set.add(20);  
		set.add(30); 
		set.add(null);
		set.add(null);
		set.add(10);  
		set.add(30); 
		//Traversing elements  
		Iterator<Integer> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
}  
}  

