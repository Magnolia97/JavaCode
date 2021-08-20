package code163;

public class Parent {
	private int dataA;
	Parent( ) {}
	Parent(int dataA) {
		this.dataA = dataA;
	}
	void show( ) {
		System.out.println("parent show : " + dataA);
	}
}
