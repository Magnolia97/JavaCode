package code99;

class Dog {
	
	String name;
	String color;
	
	Dog( ) {
		System.out.println("Default constructor is called");
	}
	
	void printDog( ) {
		System.out.println("name : " + name);
		System.out.println("color : " + color);
	}
}

public class Code99 {
	
	public static void main(String[] args)
	{
		Dog d = new Dog( ); // ���⿡�� Dog( ) ����Ʈ �����ڸ� ȣ���մϴ�.
		d.printDog( );
	}
}