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
		p.print( ); // Parent Ŭ������ print( ) �޼ҵ� ȣ��
		p.test(10); // Parent Ŭ������ test( ) �޼ҵ� ȣ��
		Child c = new Child( );
		c.print( ); // Child Ŭ������ print( ) �޼ҵ� ȣ��
		c.test(20); // Child Ŭ������ test( ) �޼ҵ� ȣ��
	}
}