package code166;

public abstract class Book {
	
	private int code; // å �ڵ�
	private String title; // å ����
	
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