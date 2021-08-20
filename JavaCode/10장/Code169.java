package code169;

interface Things {
	
	void printInfo( );
}

interface Book extends Things { // �������̽��� �������̽��� ��ӹ��� ��
	
	void showTitle( );
}

class ChildrenBook implements Book { // Ŭ������ �������̽��� ��ӹ��� ��
	
	private String title;
	private String author;
	
	ChildrenBook( ){}
	
	ChildrenBook(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void printInfo( ) { // �ݵ�� �������̵��ؾ� �մϴ�.
		System.out.println("** Info for books **");
	}
	
	public void showTitle( ) { // �ݵ�� �������̵��ؾ� �մϴ�.
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