package com.effigo.java_training_effigo.hashcode_equals;

import java.util.Objects;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Person otherPerson = (Person) obj;
		return age == otherPerson.age && name.equals(otherPerson.name);
	}

	
}

public class HashCode_Equals {
	public static void main(String[] args) {
		Person person1 = new Person("John", 25);
		Person person2 = new Person("John", 25);
		Person person3 = new Person("Jane", 30);

		System.out.println("person1.equals(person2): " + person1.equals(person2));
		System.out.println("person1.equals(person3): " + person1.equals(person3));

		System.out.println("HashCode for person1: " + person1.hashCode());
		System.out.println("HashCode for person2: " + person2.hashCode());
		System.out.println("HashCode for person3: " + person3.hashCode());
	}

}
