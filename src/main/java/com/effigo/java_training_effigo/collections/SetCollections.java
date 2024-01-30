package com.effigo.java_training_effigo.collections;

import java.util.HashSet;
import java.util.Set;

public class SetCollections {
	public static void main(String[] args) {
		Set<Integer> idSet = new HashSet<>();

		addId(idSet, 101);
		addId(idSet, 102);
		addId(idSet, 103);
		addId(idSet, 103);

		System.out.println("Unique IDs in the storage system:");
		displayIds(idSet);

		int idToCheck = 102;
		boolean isInSet = checkIdInSet(idSet, idToCheck);
		System.out.println("\nIs ID " + idToCheck + " in the set? " + isInSet);

		addId(idSet, 104);

		System.out.println("\nUpdated unique IDs in the storage system:");
		displayIds(idSet);
	}

	private static void addId(Set<Integer> idSet, int id) {
		idSet.add(id);
	}

	private static boolean checkIdInSet(Set<Integer> idSet, int id) {
		return idSet.contains(id);
	}

	private static void displayIds(Set<Integer> idSet) {
		for (int id : idSet) {
			System.out.println("- " + id);
		}
	}
}
