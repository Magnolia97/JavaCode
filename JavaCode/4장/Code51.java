package code51;

public class Code51 {

	public static void main(String[] args)
	{
		int score = 80;
		char grade;
		switch(score) {
		case 90: // score�� 90�� ���
			grade = 'A';
			break;
		case 80: // score�� 80�� ���
			grade = 'B';
			break;
		case 70: // score�� 70�� ���
			grade = 'C';
			break;
		default: // �� ���� ���
			grade = 'D';
			break;
		}
		System.out.println("grade : " + grade);
	}
}
