package code138;

class Parent {
	
	void printParent( ) {
		System.out.println("I am parent print");
	}
}

class Child extends Parent {
	
	void printChild( ) {
		System.out.println("I am chlid print");
	}
}

public class Code138 {
	
	public static void main(String[] args) {
		Child c = new Child( );
		c.printParent( );
		c.printChild( );
	}
}