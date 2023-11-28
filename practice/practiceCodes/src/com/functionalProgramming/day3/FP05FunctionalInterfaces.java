package com.functionalProgramming.day3;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FP05FunctionalInterfaces {
	public static void main(String[] args) {
		
		Predicate<Integer> isEven= x->x%2==0;
		Function<Integer, Integer> squareFunction= x->x*x;
		Function<Integer,String> printNumb= x->x+" ";
		Consumer<Integer> print= x->System.out.println(x);
		
		BinaryOperator<Integer> add= (x,y) ->x+y;
		
		Supplier<Integer> randomIntegerSupplier= ()->2;
	
		System.out.println(randomIntegerSupplier.get());
		
		UnaryOperator<Integer>  doubled= x->x+x;
		System.out.println(doubled.apply(5));
		
		BiPredicate<Integer, Integer> passOrNot= (x,y)->x>y?true:false;
		System.out.println(passOrNot.test(5, 8));
		
		//BiConsumer<Integer, Integer> printSmallAndBig=
		
	}

}
