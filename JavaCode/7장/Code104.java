package code104;

class Student {
	int no;
	String name;
	double score;
	Student(int n) { // �����ڰ� �ϳ��� ������ ����Ʈ �����ڸ� �߰����� �ʽ��ϴ�.
		no = n;
	}
	void printStudent( ) {
		System.out.println("no : " + no + ", name : " + name + ", score : " + score);
	}
}
public class Code104 {
	public static void main(String[] args)
	{
		Student s1 = new Student(); // ���� �߻�.
		Student s2 = new Student(10);
		s1.printStudent( );
		s2.printStudent( );
	}
}