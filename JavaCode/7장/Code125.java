package code125;

class Student {
	private String name;
	private int score;
	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	String getName( ) {
		return name;
	}
	int getScore( ) {
		return score;
	}
	void print( ) {
		System.out.println(name + "(" + score + ")");
	}
}

public class Code125 {
	public static void main(String[] args) {
		Student st[] = new Student[5];
		st[0] = new Student("Alice", 88);
		st[1] = new Student("Tom", 98);
		st[2] = new Student("Jenny", 80);
		st[3] = new Student("Betty", 79);
		st[4] = new Student("Daniel", 91);
		int total = 0;
		for (int i = 0 ; i < st.length; i++)
			total += st[i].getScore( );
		double average = (double) total / st.length;
		System.out.println("average : " + average);
	}
}