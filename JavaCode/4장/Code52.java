package code52;

public class Code52 {

	public static void main(String[] args)
	{
		int score = 80;
		switch(score) {
		case 90:
			System.out.println("Your score is 90");
		case 80: // 이 조건에서 걸립니다.
			System.out.println("Your score is 80");
		case 70:
			System.out.println("Your score is 70");
			break; // 여기서 멈추고 switch를 끝냅니다.
		default:
			System.out.println("Your score is under 70");
		}
	}
}
