package code149;

class Parent {
	
	void print( ) {
		System.out.println("parent - print method");
	}
	
	void test( ) {
		System.out.println("Parent - test method");

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

public class Code149 {
	
	public static void main(String[] args) {
		Parent p = new Parent( );
		p.print( );
		p.test( );
//		p.check( ); // 에러. Parent 클래스에 check( ) 메소드는 없음
		Child c = new Child( );
		c.print( );
		c.check( );
		c.test( );
		Parent x = new Child( ); // 다형성 (부모 변수에 자식 객체를 생성함)
		x.print( );
		x.test( );
//		x.check( ); // 에러. Parent 클래스에 check( )는 없는 메소드임
	}
}