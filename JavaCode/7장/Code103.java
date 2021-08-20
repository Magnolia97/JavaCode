package code103;

class Data {
	
	int m;
	
	Data(int x) { // 매개변수 1개 생성자
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