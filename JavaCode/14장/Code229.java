package code229;

class Data<T> { // Ŭ������ ���� ���׸� ��ȣ <>�� ���� �� �ȿ� �Ű����� �����.
	
	T obj; // �ν��Ͻ� ���� obj�� �ڷ����� T��.
	
	Data(T ob) { // ������ Data�� �ڷ����� T�� �μ� �� ���� �Է¹���.
		obj = ob;
	}
	
	T getObj( ) { // �ν��Ͻ� ���� obj�� �ڷ����� T��.
		return obj;
	}
	
	void showType( ) {
		System.out.println("Type of T : " + obj.getClass( ).getName( ));
	}
}

public class Code229 {
	
	public static void main(String[] args) {
		Data<Integer> d1 = new Data<Integer>(100); // ���� 100 �μ�
		System.out.println(d1.getObj( ));
		d1.showType( );
		Data<String> d2 = new Data<String>("JAVA"); // ���ڿ� ��JAVA�� �μ�
		System.out.println(d2.getObj( ));
		d2.showType( );
	}
}
