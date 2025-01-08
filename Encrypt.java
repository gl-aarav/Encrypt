/* Aarav Goyal
 * Encrypt.java
 * 1/8/2025
 */ 

import java.util.Scanner;
public class Encrypt
{
	private String line;
	
	public Encrypt
	{
		line = new String ("");
	}
	
	public static void main (String [] agrs)
	{
		Encrypt encrypt = new Encrypt();
		encrypt.rotate13Times();
	}
	
	public rotate13Times()
	{
		getString();
		for (int i = 0; i<=13; i++)
		{
			encryptString();
			printString(i);
		}
	}
	
	public getString()
	{
		Scanner in = new Scanner (System.in);
		line = in.nextLine();
	}
	
	public encryptString()
	{
	
	}
	
	public printString(int number)
	{
		System.out.println("Encryption
	}

}
