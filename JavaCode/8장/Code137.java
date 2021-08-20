package code137;

class Parent {
	
	private int data = 10;
	
	int getData( ) {
		return data;
	}
}

class Child extends Parent {
	
	int data = 20;
	
	void printData( ) {
		System.out.println("data from Parent : " + super.getData( ));
		System.out.println("data from Child : " + this.data);
		System.out.println("data from Child : " + data);
	}
}

public class Code137 {
	
	public static void main(String[] args) {
		Child c = new Child( );
		c.printData( );
	}
}