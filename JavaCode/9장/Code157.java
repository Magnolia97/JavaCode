package code157;

import java.util.Scanner;

public class Code157 {
	
	public static void main(String[] args)
	{
		Scanner scin = new Scanner(System.in);
		System.out.print("Enter your name : " );
		String name = scin.next( );
		System.out.println("You are " + name);
		scin.close( );
	}
}

