package edu.atria.functional_interface;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamBasics {
	public static void main(String[]args) {
		Stream<Integer> str=Stream.of(10,20,30,40,50);
//		Stream<Integer>strOne=str.map(num->num+2);
//		strOne.forEach(System.out::println);
// we can write the above two lines as one line
		
		str.map(num->num+2).forEach(System.out::println);
		
		Integer[]values  =new Integer[] {11,12,13,14,15};
		Arrays.stream(values).map(num->num*num).forEach(System.out::println);
		Arrays.stream(values).map(num->num*num).limit(2).forEach(System.out::println);
	}

}
