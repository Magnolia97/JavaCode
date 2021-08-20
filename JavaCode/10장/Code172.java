package code172;

interface WithDefault {
	
	int COUNT = 100;
	
	void test( );
	
	default void show( ) { // �ݵ�� �տ� default Ű���带 �ٿ��� �մϴ�.
		System.out.println("I am show");
	}
}

class Test implements WithDefault {
	
	public void test( ) { // test( ) �޼ҵ�� �߻� �޼ҵ��̹Ƿ� �������̵��մϴ�.
		System.out.println("I am test");
	}
}

public class Code172 {
	
	public static void main(String[] args) {
		Test t = new Test( );
		t.test( );
		t.show( );
	}
}