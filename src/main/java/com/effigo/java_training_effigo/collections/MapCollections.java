package com.effigo.java_training_effigo.collections;

import java.util.HashMap;
import java.util.Map;

public class MapCollections {
	public static void main(String[] args) {
		
		/**
		 * TreeMap ordered collection of iterm and it store data in for of BST
		 * all remaining methods wil be same
		 * 
		 */
		Map<Integer, String> actorMap = new HashMap<>();

		addActor(actorMap, 101, "Shah Rukh Khan");
		addActor(actorMap, 102, "Aishwarya Rai");
		addActor(actorMap, 103, "Amitabh Bachchan");

		System.out.println("Actors in the database:");
		displayActors(actorMap);

		int actorIdToFind = 102;
		String actorName = getActorName(actorMap, actorIdToFind);
		System.out.println("\nActor with ID " + actorIdToFind + " is: " + actorName);

		addActor(actorMap, 104, "Deepika Padukone");

		System.out.println("\nUpdated actors in the database:");
		displayActors(actorMap);
	}

	private static void addActor(Map<Integer, String> actorMap, int id, String name) {
		actorMap.put(id, name);
	}

	private static String getActorName(Map<Integer, String> actorMap, int id) {
		return actorMap.getOrDefault(id, "Actor not found");
	}

	private static void displayActors(Map<Integer, String> actorMap) {
		for (Map.Entry<Integer, String> actor : actorMap.entrySet()) {
			System.out.println("ID: " + actor.getKey() + ", Name: " + actor.getValue());
		}
	}
}
