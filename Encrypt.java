
/* Aarav Goyal
 * Encrypt.java
 * 1/8/2025
 */

import java.util.Scanner;

public class Encrypt 
{
	private String line;
	private int timesEncrypted;

	public Encrypt() 
	{
		line = "";
		timesEncrypted = 0;
	}

	public static void main(String[] args) 
	{
		Encrypt encrypt = new Encrypt();
		encrypt.rotate13Times();
	}

	public void rotate13Times() 
	{
		int printTimes;
		System.out.print("\n\n\nWelcome to Encrypt.java. Please enter a word, phrase, or sentence.\n\n-> ");
		getString();
		System.out.print("\nHow many times do you want to encrypt the code(1-26)\n\n-> ");
		getInt();
		if (timesEncrypted!=0 && timesEncrypted <= 26 && timesEncrypted > 0)
		{
			for (int i = 1; i <= timesEncrypted; i++) 
			{ 
				encryptString();
				printString(i);
			}
		}
		if (timesEncrypted!=0 && timesEncrypted > 26 && timesEncrypted > 0)
		{
			for (int i = 1; i <= timesEncrypted%26; i++) 
			{ 
				encryptString();
				printString(i);
			}
		}
		else if (timesEncrypted <0)
		{
			for (int i = 1; i <= 26; i++) 
			{ 
				encryptString();
				printString(i);
			}
		}
		else
		{
			System.out.println("\nEncryption 1:\n" + timesEncrypted);
		}	
		System.out.println("\n\n\n");
	}

	public void getString() 
	{
		Scanner in = new Scanner(System.in);
		line = in.nextLine();
	}

	public void getInt()
	{
		Scanner in = new Scanner (System.in);
		timesEncrypted = in.nextInt();
	}

	public void encryptString() 
	{
		String encrypted = "";
	
		for (int x = 0; x < line.length(); x++) 
		{
			char ch = line.charAt(x);
			if (ch >= 'A' && ch <= 'Z') 
				ch = (char) ((ch - 'A' + 1) % 26 + 'A');
			else if (ch >= 'a' && ch <= 'z') 
				ch = (char) ((ch - 'a' + 1) % 26 + 'a');
			encrypted += ch;
		}
		

		line = encrypted; 
	}

	public void printString(int number) 
	{
		System.out.println("\nEncryption " + number + ":\n" + line);
	}
}
