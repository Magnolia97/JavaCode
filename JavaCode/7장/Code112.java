package code112;

class Book {
	
	String title;
	int price;
	
	Book( ){}
	
	Book(String title) {
		this.title = title;
	}
	
	Book(String title, int price) {
		this(title);
		this.price = price;
	}
}

public class Code112 {
	
	public static void main(String[] args) {
		Book b = new Book("Java", 25000);
	}
}
