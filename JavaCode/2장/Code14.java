package code14;

public class Code14 {

	public static void main(String[] args)
	{
		/*
		short s = 32767;
		System.out.println(s); // 32767 ���
		s ++;
		System.out.println(s); // -32768 ���
		s ++;
		System.out.println(s); // -32767 ���
		*/
		
		short s = -32767;
		System.out.println(s); // -32767 ���
		s --;
		System.out.println(s); // -32768 ���
		s --;
		System.out.println(s); // 32767 ���
	}
}
