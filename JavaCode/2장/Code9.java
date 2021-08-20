package code9;

public class Code9 {
	public static void main(String[] args) {
		boolean x = true;
		boolean y = false;
		System.out.println(x); // true 출력
		System.out.println(y); // false 출력
		x = 5 > 10; // 우변의 결과를 x에 저장합니다.
		System.out.println(x); // false 출력
		y = 5 < 10;
		System.out.println(y); // true 출력
	}
}
