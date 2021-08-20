package code186;

public class Code186 {

	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("Hello world");
		StringBuffer sb2 = new StringBuffer("Hello world");
		System.out.println(sb1);
		if (sb1.equals(sb2)) System.out.println("sb1 equals sb2");
		else System.out.println("sb1 does not equal sb2");
	}
}
