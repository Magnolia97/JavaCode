package code142;

class Parent {
	
	void print( ) {
		System.out.println("I am parent print");
	}
	
	void test(int x) {
		System.out.println("Parent - test method");
	}
}

class Child extends Parent {
	
	void print( ) {
		super.print( );
	}
	
	void test(int x) {
		super.test(x);
	}
}

public class Code142 {

	public static void main(String[] args) {
		Parent p = new Parent( );
		p.print( );
		p.test(10);
		Child c = new Child( );
		c.print( );
		c.test(20);
	}
}