package s;

import java.io.*;
import static java.lang.System.*;

class Parent {
	Number getSome() throws IOException {
		return Long.valueOf(1L);
	}
}

public class Inh2 extends Parent {
	//@Override	
	public Long getSome(int input) throws FileNotFoundException {
		return Long.valueOf(input);
	}
	public static void main(String... unused) throws IOException {
		out.println(new Inh2().getSome());	
	}
}
