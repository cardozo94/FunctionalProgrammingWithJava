package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		
		
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		//printAllNumbersInListFunctional(numbers);
		//printEvenNumbersInListFunctional(numbers);
	//printOddNumbersInListFunctional(numbers);
		
		//courses.stream().forEach(System.out::println);
		
		//courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
		//courses.stream().filter(course -> course.length() >= 4).forEach(System.out::println);
		//printSquaresOfEvenNumbersInListFunctional(numbers);
		//printCubesOfOddNumbersInListFunctional(numbers);
		/*courses.stream()
		.map(course -> course+ " "+course.length())
		.forEach(System.out::println);*/
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		
		numbers.stream().forEach(System.out::println);
		
	}
	
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		
		numbers.stream().filter(num -> num%2==0).forEach(System.out::println);
		
	}
	
	private static void printOddNumbersInListFunctional(List<Integer> numbers) {
		
		numbers.stream().filter(num -> num%2!=0).forEach(System.out::println);
		
	}
	
	private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
		
		numbers.stream()
		.filter(num -> num%2==0)
		.map(num -> num* num)
		.forEach(System.out::println);
		
	}
	
	private static void printCubesOfOddNumbersInListFunctional(List<Integer> numbers) {
		
		numbers.stream()
		.filter(num -> num%2!=0)
		.map(num -> num*num*num)
		.forEach(System.out::println);
		
	}

}
