package code164;

public class Child extends Parent {
	
	void print( ) {
		System.out.println("I am child print");
	}
	
	void call( ) { // call( ) 메소드를 오버라이딩하지 않으면 에러가 발생합니다.
		System.out.println("I am child call");
	}
}