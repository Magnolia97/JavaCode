package code132;

class Parent {
	
	void printParent( ) {
		System.out.println("I am parent");
	}
}

class Child extends Parent {
	
	private int data;
	
	Child(int data) {
		this.data = data;
	}
	
	void printChild( ) {
		System.out.println("data : " + data);
	}
}

public class Code132 {
	
	public static void main(String[] args)
	{
		Child c = new Child(10);
		c.printParent( );
		c.printChild( );
	}
}