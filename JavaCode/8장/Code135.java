package code135;

class Person {
	
	private String name; // 이름
	private String email; // 이메일
	
	Person( ){}
	
	Person(String name) {
		this.name = name;
	}
	
	Person(String name, String email) {
		this(name);
		this.email = email;
	}
}

class Student extends Person {
	
	private int score; // 성적
	private int year; // 학년
	
	Student( ) {}
	
	Student(String name, String email) {
		super(name, email); // 생성자 ❷ 호출
	}
	
	Student(String name, String email, int score) {
		this(name, email); // 생성자 ❸ 호출
		this.score = score;
	}
	
	Student(String name, String email, int score, int year) {
		this(name, email); // 생성자 ❸ 호출
		this.score = score;
		this.year = year;
	}
}
