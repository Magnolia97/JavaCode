package code87;

import java.util.Arrays;

public class Code87 {
	
	static void updateArray(int[] B) // 배열([]) 표현이 필요합니다.
	{
		for (int i=0; i<B.length; i++)
			B[i] += 10;
	}
	
	public static void main(String[] args)
	{
		int[] A = {3, 5, 1, 9, 8, 10};
		System.out.println(Arrays.toString(A));
		updateArray(A); // 배열을 넘길 때는 이름만 넣습니다.
		System.out.println(Arrays.toString(A));
	}
}