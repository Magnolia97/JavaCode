package exceptiontest6;

public class Code204 {
	public static void makeArray( )
	{
		int A[] = new int[3];
		A[0] = 10;
		A[1] = 20;
		A[2] = 30;
		A[3] = 40;
		A[4] = 50; // 여기에서 ArrayIndexOutOfBoundsException 발생
	}
	public static void main(String[] args)
	{
		System.out.println("main starts");
		makeArray( ); // makeArray( ) 메소드에서 예외 발생
		System.out.println("main ends"); // 출력되지 않음.
	}
}
