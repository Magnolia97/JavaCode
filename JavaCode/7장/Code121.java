package code121;

class Book {
	
	private String title;
	private int price;
	
	Book( ){}
	
	Book(String title, int price){
		this.title = title;
		this.price = price;
	}
	
	String getTitle( ) { // title 접근자
		return title;
	}
	
	int getPrice( ) { // price 접근자
		return price;
	}
	
	void setTitle(String title) { // title 변경자
		this.title = title;
	}
	
	void setPrice(int price) { // price 변경자
		this.price = price;
	}
	
	void printBook( ) {
		System.out.println("title : " + title);
		System.out.println("price : " + price);
	}
}

public class Code121 {
	
	public static void main(String[] args)
	{
		Book bk = new Book("Java Programming", 25000);
		bk.printBook( );
		bk.setPrice(27000); // 변경자(mutator) 호출
		bk.setTitle("Java Programming 2"); // 변경자(mutator) 호출
		System.out.println("title : " + bk.getTitle( )); // 접근자(accessor) 호출
		System.out.println("price : " + bk.getPrice( )); // 접근자(accessor) 호출
	}
}