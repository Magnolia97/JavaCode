package code152;

class Data1 {
	
	void print( ) {
		System.out.println("class Data1 print method");
	}
}

class Data2 {
	
	void show( ) {
		System.out.println("class Data2 show method");
	}
}

public class Code152 {
	
	public static void main(String[] args) {
		Data1 d1 = new Data1( );
		Data2 d2 = new Data2( );
		if (d1 instanceof Data1) // d1�� Data1�� �ν��Ͻ����� �Ǵ��մϴ�.
			d1.print( );
		if (d2 instanceof Data2) // d2�� Data2�� �ν��Ͻ����� �Ǵ��մϴ�.
			d2.show( );
	}
}
