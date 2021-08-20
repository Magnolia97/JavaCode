package code118;

class Block {
	
	Block( ) {
		System.out.println("I am constructor");
	}
	
	static {
		System.out.println("I am static block");
	}
}

public class Code118 {
	
	public static void main(String[] args)
	{
		Block b1 = new Block( );
		Block b2 = new Block( );
	}
}