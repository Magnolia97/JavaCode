package code120;

class Data {
	private int x; // private 접근 제어(x는 클래스 내에서만 접근 가능합니다).
	public int y; // public 접근 제어(y는 어디에서나 접근 가능합니다).
	int z; // 디폴트 접근 제어(z는 같은 패키지에서만 접근 가능합니다).
}

public class Code120 {
	
	public static void main(String[] args)
	{
		Data data = new Data( );
		data.x = 10;
		data.y = 20;
		data.z = 30;
	}
}