package code198;

public class Code198 {
	public static void main(String[] args)
	{
		int a = 5, b = 0, c;
		int A[] = new int[3];
		try {
			c = a / b; // ArithmeticException �߻�
			A[3] = 100; // ArrayIndexOutOfBoundsException �߻�
		}
		catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		catch(Exception e) {
			System.out.println("���� �ε����Դϴ�.");
		}
		finally {
			System.out.println("finally ����");
		}
	}
}
