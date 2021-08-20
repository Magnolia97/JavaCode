package code150;

class Parent {
	
	void print( ) {
		System.out.println("parent - print method");
	}
	
	void test( ) {
		System.out.println("parent - test method");
	}
}

class Child extends Parent {
	
	void print( ) {
		System.out.println("child - print method");
	}
	
	void check( ) {
		System.out.println("child - check method");
	}
}

public class Code150 {
	
	public static void main(String[] args) {
		Parent x = new Child( );
		x.print( ); // print( ) 메소드는 오버라이딩되어 있어서 자식의 print( ) 호출함.
		x.test( );
	}
}
