package code154;

class Parent {
	
	void print( ) {
		System.out.println("Parent : print( )");
	}
	
	void show( ) {
		System.out.println("Parent : show( )");
	}
}

class ChildA extends Parent {
	
	void print( ) {
		System.out.println("Child-A : print( )");
	}
	
	void showA( ) {
		System.out.println("Child-A : show( )");
	}
}

class ChildB extends Parent {
	
	void print( ) {
		System.out.println("Child-B : print( )");
	}
	
	void showB( ) {
		System.out.println("Child-B : show( )");
	}
}

public class Code154 {
	
	static void doWork(Parent p) {
		if (p instanceof ChildA) {
			ChildA ca = (ChildA) p;
			ca.print( );
			ca.show( );
			ca.showA( );
		}
		else if (p instanceof ChildB) {
			ChildB cb = (ChildB) p;
			cb.print( );
			cb.show( );
			cb.showB( );
		}
		else {
			p.print( );
			p.show( );
		}
	}
	
	public static void main(String[] args) {
		Parent p = new Parent( );
		ChildA a = new ChildA( );
		ChildB b = new ChildB( );
		doWork(p);
		doWork(a);
		doWork(b);
	}
}