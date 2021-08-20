package code51;

public class Code51 {

	public static void main(String[] args)
	{
		int score = 80;
		char grade;
		switch(score) {
		case 90: // score가 90인 경우
			grade = 'A';
			break;
		case 80: // score가 80인 경우
			grade = 'B';
			break;
		case 70: // score가 70인 경우
			grade = 'C';
			break;
		default: // 그 외의 경우
			grade = 'D';
			break;
		}
		System.out.println("grade : " + grade);
	}
}
