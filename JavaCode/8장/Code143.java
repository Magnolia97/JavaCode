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
//		p.check( ); // check( ) �޼ҵ�� Parent Ŭ������ ���� ������ ���� �߻�
		Child c = new Child( );
		c.show( );
		c.print( ); // �� �ȿ� ������ �θ� Ŭ���� �޼ҵ带 �����մϴ�.
//		c.check( );
	}
}