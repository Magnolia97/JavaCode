package code104;

class Student {
	int no;
	String name;
	double score;
	Student(int n) { // 생성자가 하나라도 있으면 디폴트 생성자를 추가하지 않습니다.
		no = n;
	}
	void printStudent( ) {
		System.out.println("no : " + no + ", name : " + name + ", score : " + score);
	}
}
public class Code104 {
	public static void main(String[] args)
	{
		Student s1 = new Student(); // 에러 발생.
		Student s2 = new Student(10);
		s1.printStudent( );
		s2.printStudent( );
	}
}