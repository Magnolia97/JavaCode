package code81;

public class Code81 {
	
	public static void show( ) // �޼ҵ� ����
	{
		System.out.println("I am show method");
	}
	
	public static void main(String[] args)
	{
		System.out.println("before show call");
		show( ); // �޼ҵ� ȣ��
		System.out.println("after show call");
	}
}