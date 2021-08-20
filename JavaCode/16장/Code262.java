package code262;

interface MyValue1 {
	
	int getValue( );
}

public class Code262 {
	
	public static void main(String[] args) {
		MyValue1 mv1;
		mv1 = ( ) -> 100 ; // mv1에 람다 표현식을 넣어 둡니다.
		System.out.println( mv1.getValue( ) ) ; // 람다 표현식이 수행됩니다.
	}
}