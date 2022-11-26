package co.jp;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<Person> person = getPerson();
		
		List<Person> femaleList = person.stream()
				.filter(man -> man.getGender().equals(Gender.FEMALE))
				.collect(Collectors.toList());
		
		 OptionalLesson optionalLesson = new OptionalLesson();
		 
		 
		Optional<String> personOptional = optionalLesson.optionalLesoon();
		
		
		
		System.out.println(personOptional.isPresent());
		System.out.println(personOptional.isEmpty());
		String orElse = personOptional.orElse("Hello");
		System.out.println(orElse);
		
		Optional<String> personConfig = personOptional.map(String::toUpperCase);
		
		System.out.println(personConfig.get());
		
		
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
