package code262;

interface MyValue1 {
	
	int getValue( );
}

public class Code262 {
	
	public static void main(String[] args) {
		MyValue1 mv1;
		mv1 = ( ) -> 100 ; // mv1�� ���� ǥ������ �־� �Ӵϴ�.
		System.out.println( mv1.getValue( ) ) ; // ���� ǥ������ ����˴ϴ�.
	}
}