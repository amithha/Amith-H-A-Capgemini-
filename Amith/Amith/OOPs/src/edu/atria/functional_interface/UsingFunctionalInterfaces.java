package edu.atria.functional_interface;

import java.util.function.Supplier;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
class Display{
	static void show(String s) {
		System.out.println("*****"+s+"*****");
	}
}

public class UsingFunctionalInterfaces {
	public static void main(String[]args) {
		
	
	Consumer<String> consumer=Display::show;
	consumer.accept("Amith");
	
	Supplier<String> supplier=() -> "hello from supplier";
	consumer.accept(supplier.get());
	
	Supplier<Double> supplier1=()->Math.random();
	consumer.accept(supplier.get());
	
	//positive or negative number 
	set
	Predicate<Integer> predicate =num ->num>0;
	System.out.println(predicate.test(24));
	System.out.println(predicate.test(-20));
	
	//max test
	
	BiFunction<Integer,Integer,Integer>maxFunction = (x,y)-> x>y?x:y;
	System.out.println(maxFunction.apply(25, 114));
	
	BiFunction<String,Integer,String>printFunction =(name,num)->name+num;
	System.out.println(printFunction.apply("Good Evening",2));
}
}