package code87;

import java.util.Arrays;

public class Code87 {
	
	static void updateArray(int[] B) // �迭([]) ǥ���� �ʿ��մϴ�.
	{
		for (int i=0; i<B.length; i++)
			B[i] += 10;
	}
	
	public static void main(String[] args)
	{
		int[] A = {3, 5, 1, 9, 8, 10};
		System.out.println(Arrays.toString(A));
		updateArray(A); // �迭�� �ѱ� ���� �̸��� �ֽ��ϴ�.
		System.out.println(Arrays.toString(A));
	}
}