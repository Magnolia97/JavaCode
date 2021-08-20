package code124;

class Point {

	private int x; // x ÁÂÇ¥
	private int y; // y ÁÂÇ¥

	Point( ) {}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	int getX( ) {
		return x;
	}

	int getY( ) {
		return y;
	}

	void setX(int x) {
		this.x = x;
	}

	void setY(int y) {
		this.y = y;
	}
}

public class Code124 {
	
	static Point add(Point t1, Point t2) {
		Point t3 = new Point( );
		t3.setX(t1.getX( ) + t2.getX( ));
		t3.setY(t1.getY( ) + t2.getY( ));
		return t3;
	}
	
	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		Point p2 = new Point(11, 33);
		Point p3 = add(p1, p2);
		System.out.println("p3 : (" + p3.getX( ) + "," + p3.getY( ) + ")");
	}
}
