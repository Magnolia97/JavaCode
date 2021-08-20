package code133;

class Parent {
	
	private int dataA;
	
	Parent(int dataA) {
		this.dataA = dataA;
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

public class Code133 {
	public static void main(String[] args) {
		Child c = new Child( );
		c.printChild( );
	}
}