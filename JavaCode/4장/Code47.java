package code47;

import java.util.Scanner;

public class Code47 {
	public static void main(String[] args)
	{
		Scanner scin = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		int x = scin.nextInt();
		System.out.print("�Ǽ��� �Է��Ͻÿ� : ");
		double y = scin.nextDouble();
		System.out.print("�̸��� �Է��Ͻÿ� : ");
		String name = scin.next();
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("name : " + name);
		scin.close();
	}
}
