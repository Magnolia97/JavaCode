package code258;

class ChildThread extends Thread {

	public void run( ) {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
		}
	}
}

public class Code258 {
	
	public static void main(String[] args) {
		Thread th = new ChildThread( );
		th.start( );
		int i = 1;
		do {
			System.out.print("*");
			i++;
		} while (th.isAlive( ));
	}
}