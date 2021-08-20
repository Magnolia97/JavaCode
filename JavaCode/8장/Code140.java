package code140;

class Parent {
	
	void print( ) {
		System.out.println("I am parent print");
	}
}

class Child extends Parent {
	
	void print( ) {
		super.print( );
	}
}

public class Code140 {
	
	public static void main(String[] args) {
		Child c = new Child( );
		c.print( );
	}
}