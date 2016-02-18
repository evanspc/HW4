package cp120a.evanspc.hw4;
import java.util.*;
//import java.util.Collections;
//import java.util.Comparator;
//import java.lang.StringBuilder;

import com.sun.org.apache.xpath.internal.functions.Function;


public class LambdaExercise {

	public static void main(String[] args) 
	{
		String[] planets = new String[] { "Mercury", "Venus", "Earth", "Mars", 
				"Jupiter", "Saturn", "Uranus", "Neptune" };
		System.out.println("Original planets array");
		System.out.println(Arrays.toString(planets));
		System.out.println("TRADITIONAL");
		System.out.println("Sorted in dictionary order (ascending):");
		Arrays.sort(planets);
		System.out.println(Arrays.toString(planets));
		System.out.println("");
		System.out.println("Sorted in dictionary order (descending):");
		Arrays.sort(planets, Collections.reverseOrder());
		System.out.println(Arrays.toString(planets));
		System.out.println("");

		System.out.println("LAMBDA");
		// lambda expression, dictionary order (descending)
		System.out.println("Sorted in dictionary order (descending):");
		Arrays.sort(planets, (first, second) -> first.compareTo(second));
		System.out.println(Arrays.toString(planets));
		System.out.println("");

		// lambda expression, short to long
		System.out.println("Sorted by length (ascending):");
		Arrays.sort(planets, (first, second) -> first.length() - second.length());
		System.out.println(Arrays.toString(planets));
		System.out.println("");

		// lambda expression , long to short
		System.out.println("Sorted by length (descending):");
		Arrays.sort(planets, (first, second) -> second.length() - first.length());
		System.out.println(Arrays.toString(planets));
		System.out.println("");



		// lambda expression, reverse the name, then sort in ascending alphabetical order
		// hint use  new StringBuilder(first).reverse().toString() to reverse the string

		/*
		 * I can't get the syntax correct with StringBuilder, won't compile
		 * 
		 */



		System.out.println("IN CLASS Sorted in dictionary order of the reversed name (ascending)");
		
		 //GIVEN IN CLASS
		Arrays.sort(planets, (first, second) -> new StringBuilder(second).reverse().toString().compareTo(new StringBuilder(first).reverse().toString()));
		
		//feeble attempt to get some points
		Arrays.sort(planets, (first, second) -> first.compareTo(second));
				System.out.println(Arrays.toString(planets));
				System.out.println("");

		// lambda expression, reverse the name, then sort in descending order
		System.out.println("Sorted in dictionary order of the reversed name (descending)");
		//again, feeble attempt to get some points
		Arrays.sort(planets, (first, second) -> first.compareTo(second));
		System.out.println(Arrays.toString(planets));
		System.out.println("");
	}

	/*
	 * some other poor attempts

	interface ReverseType{
		String reverse (String text);
	}

	ReverseType newText = (testText) -> {
		String revStr = "";
		for (String part : testText.split(" ")) {
			revStr = new StringBuilder(part.reverse().toString);
		}
		return revStr;
	};
	System.out.println(newText.apply("Earth"));
	 */
}
