package co.jp;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Person> person = getPerson();
		System.out.println(person);
	}
	
	private static List<Person> getPerson() {
		return List.of(
				new Person("Bob", 22, Gender.MALE),
				new Person("Mary", 22, Gender.FEMALE),
				new Person("Max", 22, Gender.MALE),
				new Person("Alis", 22, Gender.FEMALE),
				new Person("Alex", 22, Gender.MALE),
				new Person("Jun", 22, Gender.MALE)
				);
	}
}
