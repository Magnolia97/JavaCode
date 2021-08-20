package code252;

class NumberThread extends Thread {
	
	public void run( ) {
		for (int i = 1; i<=26; i++) {
			System.out.print(i);
			try {
				Thread.sleep(1000); // 1초 동안 쉽니다.
			} catch (InterruptedException e) {
				System.out.println(e.getMessage( ));
			}
		}
	}
}

public class Code252 {
	
	public static void main(String[] args)
	{
		Thread t = new NumberThread( );
		t.start( );
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage( ));
			}
		}
	}
}