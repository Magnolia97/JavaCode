package code53;

public class Code53 {
	public static void main(String[] args)
	{
		int a = 1;
		int sum = 0;
		while (a <= 10)
		{
			sum += a; // sum += a�� 10ȸ ������.
			a += 1;
		}
		System.out.println("sum : " + sum);
	}
}
