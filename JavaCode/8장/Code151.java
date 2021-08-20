package code151;

class Person {
	
	private String name;
	
	Person( ){}
	
	Person(String name) {
		this.name = name;
	}
	
	String getName( ) {
		return name;
	}
	
	void print( ) {
		System.out.println("I am " + name);
	}
}

class Teacher extends Person {
	
	private String subject;
	
	Teacher( ){}
	
	Teacher(String name, String subject) {
		super(name);
		this.subject = subject;
	}
	
	void print( ) {
		System.out.println("I am " + getName( ) + " and I teach " + subject + ".");
	}
}

class Student extends Person {
	
	private String year;
	
	Student( ){}
	
	Student(String name, String year) {
		super(name);
		this.year = year;
	}
	
	void print( ) {
		System.out.println("I am " + getName( ) + " and I am " + year + ".");
	}
}

public class Code151 {
	
	public static void main(String[] args) {
		Person p1 = new Teacher("Alice", "Math");
		Person p2 = new Student("David", "Sophomore");
		p1.print( );
		p2.print( );
	}
}