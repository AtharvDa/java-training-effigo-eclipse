package com.effigo.java_training_effigo.collections;

import java.util.ArrayList;
import java.util.List;

public class ListCollections {

	public static void main(String[] args) {

		/**
		 * Note : Both ArrayList and LinkedList can be used to store data But
		 * they have different usecases for different task and data is stored differently in both list
		 * 
		 * Linkedlist is best for updation and deletion from middle 
		 * while Arraylist is better for searching 

		 */
		
		List<String> products = new ArrayList<>();
		products.add("Laptop");
		products.add("Mouse");
		products.add("KeyBoard");
		products.add("PenDrive");

		printList(products);

		for (int i = 0; i < products.size(); i++) {
			if (i % 2 == 0)
				products.set(i, "dummy");
		}

		printList2(products);

		products.remove(0);

		System.out.println(products);

	}

	private static void printList2(List<String> products) {

		for (int i = 0; i < products.size(); i++) {
			System.out.print(products.get(i) + " ");
		}
		System.out.println();
	}

	private static void printList(List<String> products) {

		for (String product : products) {
			System.out.print(product + " ");
		}
		System.out.println();
	}
}
