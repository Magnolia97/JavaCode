package code101;

class Friend {
	
	String name;
	int age;
	
	Friend( ) { } // 디폴트 생성자
	Friend(String n, int a) { // 매개변수(인수)가 있는 생성자
		name = n;
		age = a;
	}
	
	void printFriend( ) {
		System.out.println("name : " + name + ", age : " + age);
	}
}

public class Code101 {
	
	public static void main(String[] args)
	{
		Friend f = new Friend("Alice", 20);
		f.printFriend( );
	}
}