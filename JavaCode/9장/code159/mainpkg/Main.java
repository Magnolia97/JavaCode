package mainpkg;

import childpkg.Child;
import parentpkg.Parent;

public class Main {
	public static void main(String[] args)
	{
		Parent p = new Parent(10);
		Child c = new Child(50, 60);
		p.show( );
		c.show( );
	}
}
