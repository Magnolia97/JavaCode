package code119;

class Book {
	
	private String title;
	private int price;
	
	Book( ){}
	
	Book(String title, int price){
		this.title = title;
		this.price = price;
	}
	
	void printBook( ) {
		System.out.println("title : " + title);
		System.out.println("price : " + price);
	}
}

public class Code119 {
	
	public static void main(String[] args)
	{
		Book bk = new Book("Java Programming", 25000);
		bk.printBook( );
		bk.price = 27000; // ¿¡·¯ (The field Book.price is not visible.)
	}
}