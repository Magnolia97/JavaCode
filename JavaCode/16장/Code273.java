package code273;

class Test {
	private String msg;
	
	Test(String m) {
		msg = m;
	}
	
	@Deprecated
	String getMsg( ) {
		return msg;
	}
}

public class Code273 {
	
	public static void main(String[] args) {
		Test t = new Test("hello");
		System.out.println(t.getMsg( ));
	}
}