package code263;

interface MyValue2 {
	
	double getValue( ); // no parameter
}

public class Code263 {
	
	public static void main(String[] args) {
		MyValue2 mv2; // MyValue2 ���� ����
		mv2 = ( ) -> 100.5 ; // mv2�� ���� ǥ���� �Ҵ�
		System.out.println( mv2.getValue( ) ) ; // ���� ǥ���� ����
	}
}