package code141;

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
		System.out.println("Child - test method");
	}
}

public class Code141 {
	
	public static void main(String[] args) {
		Parent p = new Parent( );
		p.print( ); // Parent 클래스의 print( ) 메소드 호출
		p.test(10); // Parent 클래스의 test( ) 메소드 호출
		Child c = new Child( );
		c.print( ); // Child 클래스의 print( ) 메소드 호출
		c.test(20); // Child 클래스의 test( ) 메소드 호출
	}
}