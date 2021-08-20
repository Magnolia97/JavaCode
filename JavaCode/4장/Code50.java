package code50;

public class Code50 {

	public static void main(String[] args)
	{
		int score = 92;
		if (score >= 90)
			System.out.println("Excellent!");
		else if (score >= 80) // else if (score >= 80 && score < 90)과 같음
			System.out.println("Good!!");
		else if (score >= 70) // else if (score >= 70 && score < 80)과 같음
			System.out.println("Ok");
		else
			System.out.println("Not ok");
	}
}
