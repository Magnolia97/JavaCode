package code93;

class Car {
	
	String kind; // 차종
	String color; // 색상
	int year; // 연식
	
	void run( ) {
		System.out.println("car is running.");
	}
	
	void speedUp( ) {
		System.out.println("car is speeding up.");
	}
}

public class Code93 {
	
	public static void main(String[] args) {
		Car myCar = new Car( ); // new는 인스턴스를 생성하는 키워드입니다.
		myCar.kind = "Sonata"; // ‘인스턴스명.속성’을 이용하여 속성을 채웁니다.
		myCar.color = "white";
		myCar.year = 2015;
		Car yourCar = new Car( );
		yourCar.kind = "Pride";
		yourCar.color = "blue";
		yourCar.year = 2017;
		myCar.run( );
		yourCar.run( );
		myCar.speedUp( );
		yourCar.speedUp( );
	}
}