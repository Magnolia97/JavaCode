package code267;

interface Test {
	
	int getSum(int n);
}

public class Code267 {
	
	public static void main(String[] args) {
		Test t = (n) -> {
			int result = 0;
			for (int i = 1; i <= n; i++)
				result += i;
			return result;
		}; // 반드시 세미콜론을 넣어야 합니다.
		System.out.println("sum from 1 to 10 is " + t.getSum(10));
		System.out.println("sum from 1 to 20 is " + t.getSum(20));
		System.out.println("sum from 1 to 30 is " + t.getSum(30));
	}
}