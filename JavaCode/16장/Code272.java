package code272;

enum Cards {
	HEART, CLUB, SPADE, DIAMOND
}

public class Code272 {
	
	public static void main(String[] args) {
		Cards cd1, cd2, cd3;
		for (Cards c : Cards.values( ))
			System.out.println(c + " : " + c.ordinal( ));
		cd1 = Cards.HEART;
		cd2 = Cards.SPADE;
		cd3 = Cards.HEART;
		if (cd1.compareTo(cd2) < 0)
			System.out.println("cd1 < cd2");
		else
			System.out.println("cd1 > cd2");
		if (cd1.compareTo(cd3) == 0)
			System.out.println("cd1 == cd3");
		else
			System.out.println("cd1 != cd3");
	}
}