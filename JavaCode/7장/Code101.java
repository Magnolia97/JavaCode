package code101;

class Friend {
	
	String name;
	int age;
	
	Friend( ) { } // ����Ʈ ������
	Friend(String n, int a) { // �Ű�����(�μ�)�� �ִ� ������
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