package code105;

class PersonInfo
{
	String name;
	int age;
	double height;
	
	PersonInfo(){}
	
	PersonInfo(String n, int a, double h) {
		name = n;
		age = a;
		height = h;
	}
	
	void printAll( ) {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("height : " + height);
	}
}

public class Code105 {
	
	public static void main(String[] args)
	{
		PersonInfo p1 = new PersonInfo( );
		PersonInfo p2 = new PersonInfo("Alice", 10, 115.5);
		p1.printAll( );
		p2.printAll( );
	}
}