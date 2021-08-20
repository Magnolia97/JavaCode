package code213;

import java.io.FileInputStream;
import java.io.IOException;

public class Code213 {
	public static void main(String[] args)
	{
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("input.txt");
			System.out.print((char)fis.read( ));
		}
		catch(IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				fis.close( );
			}
			catch (IOException e) {
			}
		}
	}
}
