package r;

import q.MonA;
import q.Color;

public class Main {

	public static void main(String... unused) {
		@MonA(color=Color.BLUE) String s = "hello";
		System.out.println(s);	
	}
}
