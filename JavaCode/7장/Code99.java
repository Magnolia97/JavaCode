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
		Dog d = new Dog( ); // 여기에서 Dog( ) 디폴트 생성자를 호출합니다.
		d.printDog( );
	}
}