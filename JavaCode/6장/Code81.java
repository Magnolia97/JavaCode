package code81;

public class Code81 {
	
	public static void show( ) // 메소드 정의
	{
		System.out.println("I am show method");
	}
	
	public static void main(String[] args)
	{
		System.out.println("before show call");
		show( ); // 메소드 호출
		System.out.println("after show call");
	}
}