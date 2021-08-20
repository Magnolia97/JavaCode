package code253;

class NumberThread extends Thread {
	
	public void run( ) {
		for (int i = 1; i<=26; i++) {
			System.out.print(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage( ));
			}
		}
	}
}

class CharThread extends Thread {
	
	public void run( ) {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage( ));
			}
		}
	}
}

public class Code253 {
	
	public static void main(String[] args)
	{
		Thread t1 = new NumberThread( ); // ������ t1 ����
		Thread t2 = new CharThread( ); // ������ t2 ����
		t1.start( ); // t1�� run( ) �޼ҵ� ����
		t2.start( ); // t2�� run( ) �޼ҵ� ����
		for (char ch='A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage( ));
			}
		}
	}
}