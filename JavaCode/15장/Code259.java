package code259;

class ChildThread extends Thread {
	
	public void run( ) {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
		}
	}
}

public class Code259 {
	
	public static void main(String[] args) {
		Thread th = new ChildThread( );
		th.start( );
		for (int i = 1; i <= 26; i++)
			System.out.print(i);
		try {
			th.join( );
		} catch(InterruptedException ex) {
			System.out.println("main thread interrupted");
		}
		System.out.println("main thread ending");
	}
}