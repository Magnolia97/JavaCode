package code192;

import java.util.Scanner;

public class Code192 {

	public static void main(String[] args) {
		int computerChoice, guess = 0;
		int count = 0;
		// ��ǻ�Ͱ� 1 ~ 100 ������ ������ �ϳ� �����ϵ��� �մϴ�.
		computerChoice = (int) (Math.random( ) * 100);
		System.out.println("��ǻ�Ͱ� 1���� 100������ �ϳ��� ������ �����߽��ϴ�.");
		System.out.println("***** ��ǻ�Ͱ� ������ ���� ���� ������ ****");
		System.out.println("-------------------------------------");
		while (computerChoice != guess) {
			System.out.print("1�� 100������ ���� �Է��ϼ��� : ");
			count += 1;
			Scanner scin = new Scanner(System.in);
			guess = scin.nextInt( );
			if (guess > computerChoice)
				System.out.println("�� ���� ���� �Է��ϼ���");
			if (guess < computerChoice)
				System.out.println("�� ū ���� �Է��ϼ���");
		}
		System.out.println("��ǻ�Ͱ� ������ ���� ������ϴ�.");
		System.out.println("�õ�Ƚ���� " + count + "���Դϴ�.");
	}
}