package code172;

interface WithDefault {
	
	int COUNT = 100;
	
	void test( );
	
	default void show( ) { // 반드시 앞에 default 키워드를 붙여야 합니다.
		System.out.println("I am show");
	}
}

class Test implements WithDefault {
	
	public void test( ) { // test( ) 메소드는 추상 메소드이므로 오버라이딩합니다.
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