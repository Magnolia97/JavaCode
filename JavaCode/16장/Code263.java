package code263;

interface MyValue2 {
	
	double getValue( ); // no parameter
}

public class Code263 {
	
	public static void main(String[] args) {
		MyValue2 mv2; // MyValue2 변수 생성
		mv2 = ( ) -> 100.5 ; // mv2에 람다 표현식 할당
		System.out.println( mv2.getValue( ) ) ; // 람다 표현식 수행
	}
}