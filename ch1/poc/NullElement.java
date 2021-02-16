package ch1.poc;

@interface MonA {
	String test();
}

public class NullElement {
	@MonA(test=null) String maVal;
}
