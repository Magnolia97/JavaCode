package code130;

class Parent {
	
	Parent( ) {
		System.out.println("parent constructor is called");
	}
	
	void printParent( ) {
		System.out.println("I am parent");

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

public class Code130 {
	
	public static void main(String[] args) {
		Child c = new Child( ); // �θ� ������ ȣ�� �Ŀ� �ڽ��� ������ ȣ��
		c.printParent( );
		c.printChild( );
	}
}