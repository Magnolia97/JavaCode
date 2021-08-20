package code136;

class Parent {
	
	int data = 10;
}

class Child extends Parent {
	
	int data = 20;
	
	void printData( ) {
		System.out.println("data from Parent : " + super.data);
		System.out.println("data from Child : " + this.data);
		System.out.println("data from Child : " + data);
	}
}

public class Code136 {
	
	public static void main(String[] args) {
		Child c = new Child( );
		c.printData( );
	}
}