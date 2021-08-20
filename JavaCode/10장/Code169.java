package code169;

interface Things {
	
	void printInfo( );
}

interface Book extends Things { // 인터페이스가 인터페이스를 상속받을 때
	
	void showTitle( );
}

class ChildrenBook implements Book { // 클래스가 인터페이스를 상속받을 때
	
	private String title;
	private String author;
	
	ChildrenBook( ){}
	
	ChildrenBook(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void printInfo( ) { // 반드시 오버라이딩해야 합니다.
		System.out.println("** Info for books **");
	}
	
	public void showTitle( ) { // 반드시 오버라이딩해야 합니다.
		System.out.println("title : " + title);
		System.out.println("author : " + author);
	}
}

public class Code169 {
	
	public static void main(String[] args)
	{
		ChildrenBook b = new ChildrenBook("Little Mermaid", "Andersen");
		b.printInfo( );
		b.showTitle( );
	}
}