package code103;

class Data {
	
	int m;
	
	Data(int x) { // �Ű����� 1�� ������
		m = x;
	}
	
	void printData( ) {
		System.out.println("m : " + m);
	}
}

public class Code103 {
	
	public static void main(String[] args) {
		Data d = new Data(100);
		d.printData( );
	}
}