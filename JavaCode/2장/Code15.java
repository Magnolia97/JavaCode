package code15;

public class Code15 {

	public static void main(String[] args)
	{
		/*
		int i = 2147483647;
		System.out.println(i); // 2147483647 ���
		i++;
		System.out.println(i); // -2147483648 ���
		*/
		
		int i = -2147483648;
		System.out.println(i); // -2147483648 ���
		i--;
		System.out.println(i); // 2147483647 ���
	}
}
