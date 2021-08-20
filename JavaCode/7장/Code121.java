package code121;

class Book {
	
	private String title;
	private int price;
	
	Book( ){}
	
	Book(String title, int price){
		this.title = title;
		this.price = price;
	}
	
	String getTitle( ) { // title ������
		return title;
	}
	
	int getPrice( ) { // price ������
		return price;
	}
	
	void setTitle(String title) { // title ������
		this.title = title;
	}
	
	void setPrice(int price) { // price ������
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
		bk.setPrice(27000); // ������(mutator) ȣ��
		bk.setTitle("Java Programming 2"); // ������(mutator) ȣ��
		System.out.println("title : " + bk.getTitle( )); // ������(accessor) ȣ��
		System.out.println("price : " + bk.getPrice( )); // ������(accessor) ȣ��
	}
}