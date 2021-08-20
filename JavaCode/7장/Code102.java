package code102;

class Student {
	
	int no; // 번호
	String name; // 이름
	double score; // 성적
	
	Student( ){} // 디폴트 생성자
	
	Student(int n) { // 번호만 초기화하는 생성자
		no = n;
	}
	
	Student(int n, String nm) { // 번호, 이름을 초기화하는 생성자
		no = n;
		name = nm;
	}
	
	Student(int n, String nm, double s) { // 번호, 이름, 성적을 초기화하는 생성자
		no = n;
		name = nm;
		score = s;
	}
	
	void printStudent( ) {
		System.out.println("no : " + no + ", name : " + name + ", score : " + score);
	}
}

public class Code102 {
	
	public static void main(String[] args)
	{
		Student s1 = new Student( );
		Student s2 = new Student(10);
		Student s3 = new Student(15, "David");
		Student s4 = new Student(20, "Paul", 92.5);
		s1.printStudent( );
		s2.printStudent( );
		s3.printStudent( );
		s4.printStudent( );
	}
}