package com.use;

import java.lang.annotation.*;
import java.util.function.*;

@Target(ElementType.TYPE_USE)
@interface A1 {
	int value() default 0;
}

public class T1 {

public static void main(String... unused) {

	Predicate<String> p = new @A1 Predicate<String> (){
		public boolean test(String s) { return true;}
	};
	
	System.out.println(p.test("aa"));	
}
}
