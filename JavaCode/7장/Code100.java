package code100;

class Point {
	
	int x;
	int y;
	
	Point( ) {
		x = 10;
		y = 20;
	}
	
	void print( ) {
		System.out.println("(" + x + "," + y +
				")");
	}
}

public class Code100 {
	
	public static void main(String[] args)
	{
		Point p1 = new Point( );
		Point p2 = new Point( );
		p1.print( );
		p2.print( );
	}
}