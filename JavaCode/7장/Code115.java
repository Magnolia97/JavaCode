package code115;

class Person {
	
	static int count;
	String name;
	
	Person( ) {
		count ++;
	}
	
	static void printCount( ) {
		System.out.println("count : " + count);
	}
}

public class Code115 {
	
	public static void main(String[] args)
	{
		Person p1 = new Person( );
		Person p2 = new Person( );
		Person.printCount( ); // ��Ŭ������.�޼ҵ��( )������ ���ϴ�
		p1.printCount( ); // ���ν��Ͻ���.�޼ҵ�( )������ �ص� �˴ϴ�.
		p2.printCount( );
	}
}