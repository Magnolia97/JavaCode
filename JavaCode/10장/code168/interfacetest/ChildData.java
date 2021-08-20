package interfacetest;

public class ChildData implements Data {
	
	public void print( ) { // 인터페이스의 메소드들은 public 제어를 갖습니다.
		System.out.println("I am child print");
	}
}