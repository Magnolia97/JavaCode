package code131;

class Parent {
	
	void printParent( ) {
		System.out.println("I am parent");
	}
}

class Child extends Parent {
	
	Child( ) {
		System.out.println("child constructor is called");
	}
	
	void printChild( ) {
		System.out.println("I am child");
	}
}

public class Code131 {
	
	public static void main(String[] args)
	{
		Child c = new Child( );
		c.printParent( );
		c.printChild( );
	}
}