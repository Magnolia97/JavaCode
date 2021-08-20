package code89;

public class Code89 {
	
	public static void varArgTest(int ... v)
	{
		System.out.println("number of arguments : " + v.length);
		for (int i=0; i<v.length; i++)
			System.out.println(v[i]);
	}
	
	public static void main(String[] args)
	{
		varArgTest( ); // 인수가 없습니다.
		varArgTest(1); // 인수가 1개인 경우
		varArgTest(3, 5); // 인수가 2개인 경우
		varArgTest(100, 200, 300); // 인수가 3개인 경우
	}
}
