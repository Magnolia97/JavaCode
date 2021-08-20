package code178;

class Thing {
	
	private String name;
	private int price;
	
	Thing(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void show( ) {
		System.out.println("name : " + name + ", price : " + price);
	}
}

public class Code178 {
	
	public static void main(String[] args)
	{
		Thing t = new Thing("book", 20000);
		String s = t.toString( );
		System.out.println(s);
		System.out.println(t);
		t.show( );
	}
}