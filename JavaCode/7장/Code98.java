package code98;

class Friend { // 클래스 Friend에는 생성자가 하나도 없습니다.
	
	String name;
	int age;
	// Friend( ){ } 생성자가 하나도 없는 경우에는 자동으로 디폴트 생성자를 제공합니다.
	
	void printFriend( ) {

		System.out.println("name : " + name + ", age : " + age);
	}
}

public class Code98 {
	
	public static void main(String[] args)
	{
		Friend f = new Friend( ); // 디폴트 생성자 자동 호출
		f.printFriend( ); // 인스턴스를 생성하고 바로 출력해 봅니다.
		f.name = "Alce";
		f.age = 20;
		f.printFriend( );
	}
}