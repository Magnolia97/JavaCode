package code94;

class Dog { // �� ���� �ν��Ͻ� ���� name, age�� �����ϴ�.
	
	String name;
	int age;
}

public class Code94 {
	
	public static void main(String[] args) {
		Dog happy = new Dog( ); // ��ü�� �����մϴ�.
		Dog bella = new Dog( ); // ��ü�� �����մϴ�.
		happy.name = "Happy";
		happy.age = 3;
		bella.name = "Bella";
		bella.age = 2;
		System.out.println("���� ������ �� ������ Ű��ϴ�.");
		System.out.println("�� ������ �̸��� " + happy.name + "�̰�, " +
				happy.age + "���Դϴ�.");
		System.out.println("�ٸ� �� ������ �̸��� " + bella.name + "�̰�, " +
				bella.age + "���Դϴ�.");
	}
}