package code109;

class Student {

	static int numberOfStudent;
	String name;
	double score;

	Student( ){
		numberOfStudent ++;
	}

	Student(String n, double s) {
		numberOfStudent ++;
		name = n;
		score = s;
	}

	void print( ) {
		System.out.println("name : " + name);
		System.out.println("score : " + score);
		System.out.println("numberOfStudent : " +
				numberOfStudent);
	}
}

public class Code109 {

	public static void main(String[] args)
	{
		Student s1 = new Student("Alice", 90.5);
		s1.print( );
		Student s2 = new Student("David", 88.3);
		s2.print( );
		Student s3 = new Student("Cindy", 77.1);
		s3.print( );
	}
}