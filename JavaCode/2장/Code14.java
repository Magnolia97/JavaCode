package code14;

public class Code14 {

	public static void main(String[] args)
	{
		/*
		short s = 32767;
		System.out.println(s); // 32767 출력
		s ++;
		System.out.println(s); // -32768 출력
		s ++;
		System.out.println(s); // -32767 출력
		*/
		
		short s = -32767;
		System.out.println(s); // -32767 출력
		s --;
		System.out.println(s); // -32768 출력
		s --;
		System.out.println(s); // 32767 출력
	}
}
