package code113;

class Student {
	
	int number;
	String name;
	double score;
	
	Student( ){}
	
	Student(int number) {
		this.number = number;
	}
	
	Student(int number, String name) {
		this(number);
		this.name = name;
	}
	
	Student(int number, String name, double score) {
		this(number, name);
		this.score = score;
	}
}

public class Code113 {
	
	public static void main(String[] args) {
		Student s = new Student(10, "Paul", 88.5);
	}
}
