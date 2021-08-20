package code166;

public abstract class Book {
	
	private int code; // 책 코드
	private String title; // 책 제목
	
	Book( ){}
	
	Book(int code, String title) {
		this.code = code;
		this.title = title;
	}
	
	int getCode( ) {
		return code;
	}
	
	String getTitle( ) {
		return title;
	}
	
	abstract void printInfo( );
}