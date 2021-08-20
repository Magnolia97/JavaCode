package code108;

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

public class Code108 {
	
	public static void main(String[] args)
	{
		Student s1 = new Student("Alice", 90.5);
		Student s2 = new Student("David", 88.3);
		Student s3 = new Student("Cindy", 77.1);
		s1.print( );
		s2.print( );
		s3.print( );
	}
}