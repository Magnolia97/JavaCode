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
		super(name, phone); // super는 부모 생성자를 호출하는 키워드입니다.
		this.score = score;
	}
	
	void printStudent( ) {
		printPerson( ); // 부모 클래스의 printPerson( ) 메소드를 사용할 수 있습니다.
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