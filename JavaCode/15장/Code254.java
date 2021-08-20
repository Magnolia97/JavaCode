package code254;

class NumberThread implements Runnable {
	
	public void run( ) {
		for (int i = 1; i <= 26; i++)
			System.out.print(i);
	}
}

public class Code254 {
	
	public static void main(String[] args) {
		Thread t = new Thread(new NumberThread( ));
		t.start( );
		for (char ch = 'A'; ch <= 'Z'; ch++)
			System.out.print(ch);
	}
}