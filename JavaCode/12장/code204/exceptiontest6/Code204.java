package exceptiontest6;

public class Code204 {
	public static void makeArray( )
	{
		int A[] = new int[3];
		A[0] = 10;
		A[1] = 20;
		A[2] = 30;
		A[3] = 40;
		A[4] = 50; // ���⿡�� ArrayIndexOutOfBoundsException �߻�
	}
	public static void main(String[] args)
	{
		System.out.println("main starts");
		makeArray( ); // makeArray( ) �޼ҵ忡�� ���� �߻�
		System.out.println("main ends"); // ��µ��� ����.
	}
}
