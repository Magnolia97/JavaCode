package code170_2;

interface Person {
	
	void print( ); // public abstract »ý·«
}

class Teacher implements Person {
	
	public void print( ) {
		System.out.println("teacher");
	}
}

class Student implements Person {
	
	public void print( ) {
		System.out.println("student");
	}
}

public class Code170_2 {
	
	public static void main(String[] args) {
		Person t = new Teacher( );
		Person s = new Student( );
		t.print( );
		s.print( );
	}
}