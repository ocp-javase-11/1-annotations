package com.use;

import java.lang.annotation.*;
import java.util.function.*;

@Target(ElementType.TYPE_USE)
@interface A2 {
	int value() default 0;
}

public class T2 {

public static void main(String... unused) {

	Predicate<String> p = new @A2 Predicate<String> (){
		public boolean test(String s) { return true;}
	};
	
	System.out.println(p.test("aa"));	
}
}
