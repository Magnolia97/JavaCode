package code128;

class Person {
	
	private String name;
	private String phone;
	
	Person( ){}
	
	Person(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	void printPerson( ) {
		System.out.println("name : " + name);
		System.out.println("phone : " + phone);
	}
}

class Student extends Person {
	
	private int score;
	
	Student( ){}
	
	Student(String name, String phone, int score) {
		super(name, phone); // super�� �θ� �����ڸ� ȣ���ϴ� Ű�����Դϴ�.
		this.score = score;
	}
	
	void printStudent( ) {
		printPerson( ); // �θ� Ŭ������ printPerson( ) �޼ҵ带 ����� �� �ֽ��ϴ�.
		System.out.println("score : " + score);
	}
}

public class Code128 {
	
	public static void main(String[] args)
	{
		Student s = new Student("Alice", "010-111-1111", 90);
		s.printStudent( );
	}
}