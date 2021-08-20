package code143;

class Parent {
	void show( ) {
		System.out.println("I am parent show");
	}
	void print( ) {
		System.out.println("I am parent print");
	}
}
class Child extends Parent {
	void show( ) {
		System.out.println("I am child show");
	}
	void print( ) {
		System.out.println("I am child print");
	}
}

public class Code143 {
	public static void main(String[] args)
	{
		Parent p = new Parent( );
		p.show( );
		p.print( );
//		p.check( ); // check( ) 메소드는 Parent 클래스에 없기 때문에 에러 발생
		Child c = new Child( );
		c.show( );
		c.print( ); // 내 안에 없으면 부모 클래스 메소드를 수행합니다.
//		c.check( );
	}
}