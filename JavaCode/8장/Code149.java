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
//		p.check( ); // ����. Parent Ŭ������ check( ) �޼ҵ�� ����
		Child c = new Child( );
		c.print( );
		c.check( );
		c.test( );
		Parent x = new Child( ); // ������ (�θ� ������ �ڽ� ��ü�� ������)
		x.print( );
		x.test( );
//		x.check( ); // ����. Parent Ŭ������ check( )�� ���� �޼ҵ���
	}
}