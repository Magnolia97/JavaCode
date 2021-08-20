package code215;

import java.io.FileInputStream;
import java.io.IOException;

public class Code215 {
	public static void main(String[] args) {
		int i;
		try (FileInputStream fin = new FileInputStream("data.txt");) {
			do {
				i = fin.read( ); // read from file
				if (i != -1) System.out.print((char) i);
			} while (i!= -1);
		} catch(IOException e) {
			System.out.println("Error reading file.");
		}
	}
}
	