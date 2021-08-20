package code264;

interface MyValue3 {
	
	double getValue(int n); // no parameter
}

public class Code264 {
	
	public static void main(String[] args) {
		MyValue3 mv3; // MyValue 참조 변수 생성
		mv3 = (n) -> 1.0/n ; // 지연 처리
		System.out.println( mv3.getValue(5));
		System.out.println( mv3.getValue(10));
		System.out.println( mv3.getValue(100));
		System.out.println( mv3.getValue(2000));
	}
}
