package q;

enum Color {BLUE,RED}

public @interface MonA {
	Color color() default Color.BLUE;
}
