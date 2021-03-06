package com.java8features;

import java.util.HashMap;
import java.util.Map;
public class TestLambda8MapIterate {
	public static void main(String[] args) {
		Map<String, Integer> prices = new HashMap<>();
		prices.put("Apple", 50);
		prices.put("Orange", 20);
		prices.put("Banana", 10);
		prices.put("Grapes", 40);
		prices.put("Papaya", 50);
		
		/* Iterate without using Lambda
		   for (Map.Entry<String, Integer> entry : prices.entrySet()) {
		   System.out.println("Fruit: " + entry.getKey() + ", Price: " + entry.getValue());
		   }
		*/ 
		
		prices.forEach((fruit,price) -> System.out.println("Fruit: " + fruit + ", Price: " + price));

	}
}
