package code54;

import java.util.Scanner;

public class Code54 {
	public static void main(String[] args)
	{
		Scanner scin = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = scin.nextInt();
		int a = 1;
		while (a <= n)
		{
			if (n % a == 0) // a�� n�� ������� �Ǵ���
				System.out.print(a + " ");
			a += 1;
		}
		scin.close();
	}
}
