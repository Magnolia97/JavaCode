package code214;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Code214 {
	public static void main(String[] args)
	{
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("input.txt");
			System.out.print((char)fis.read( ));
		}
		catch(FileNotFoundException e) {
			System.out.println("input.txt�� ���� �����Դϴ�.");
		}
		catch(IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				fis.close( );
			}
			catch (IOException e) {
				System.out.println(e);
			}
			catch (NullPointerException e) {
				System.out.println("fis�� null ���� ���� �ֽ��ϴ�.");
			}
		}
	}
}
