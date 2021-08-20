package code139;

class Parent {
	
	void print( ) {
		System.out.println("I am parent print");
	}
}

class Child extends Parent {
	
	void print( ) {
		System.out.println("I am chlid print");
	}
}

public class Code139 {
	
	public static void main(String[] args) {
		Child c = new Child( );
		c.print( );
	}
}