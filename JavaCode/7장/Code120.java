package code120;

class Data {
	private int x; // private ���� ����(x�� Ŭ���� �������� ���� �����մϴ�).
	public int y; // public ���� ����(y�� ��𿡼��� ���� �����մϴ�).
	int z; // ����Ʈ ���� ����(z�� ���� ��Ű�������� ���� �����մϴ�).
}

public class Code120 {
	
	public static void main(String[] args)
	{
		Data data = new Data( );
		data.x = 10;
		data.y = 20;
		data.z = 30;
	}
}