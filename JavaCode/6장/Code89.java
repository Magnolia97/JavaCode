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
		varArgTest( ); // �μ��� �����ϴ�.
		varArgTest(1); // �μ��� 1���� ���
		varArgTest(3, 5); // �μ��� 2���� ���
		varArgTest(100, 200, 300); // �μ��� 3���� ���
	}
}
