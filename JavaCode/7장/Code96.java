package code96;


class Car
{
	String kind;
	String color;
	int year;
}

public class Code96 {

	public static void main(String[] args)
	{
		Car myCar = new Car( );
		myCar.kind = "Sonata";
		myCar.color = "white";
		myCar.year = 2015;
		Car myCar2;
		myCar2 = myCar;
		System.out.println(myCar);
		System.out.println(myCar2);
	}
}
