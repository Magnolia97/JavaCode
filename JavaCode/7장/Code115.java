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
		Person.printCount( ); // ‘클래스명.메소드명( )’으로 씁니다
		p1.printCount( ); // ‘인스턴스명.메소드( )’으로 해도 됩니다.
		p2.printCount( );
	}
}