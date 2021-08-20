package code102;

class Student {
	
	int no; // ��ȣ
	String name; // �̸�
	double score; // ����
	
	Student( ){} // ����Ʈ ������
	
	Student(int n) { // ��ȣ�� �ʱ�ȭ�ϴ� ������
		no = n;
	}
	
	Student(int n, String nm) { // ��ȣ, �̸��� �ʱ�ȭ�ϴ� ������
		no = n;
		name = nm;
	}
	
	Student(int n, String nm, double s) { // ��ȣ, �̸�, ������ �ʱ�ȭ�ϴ� ������
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