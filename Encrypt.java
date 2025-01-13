import java.util.Scanner;

public class Encrypt 
{
	private String original;
	private String line;
	private int increment;

	public Encrypt() 
	{
		original = "original";
		line = "line";
		increment = 0;
	}

	public static void main(String[] args) 
	{
		Encrypt encrypt = new Encrypt();
		encrypt.rotateTimes();
	}

	public void rotateTimes() 
	{

		System.out.print("\n\n\nWelcome to Encrypt.java. Please enter a word, phrase, or sentence.\n\n-> ");
		getString();
		System.out.print("\nHow many letter increments do you want to have in the code?\n\n-> ");
		getInt();
		int i=0;
		line = original;
		do
		{
			encryptString(); 
			i++;
			printString(i);
		} while(!original.equals(line));

		System.out.println("\n\n\n");
	}

	public void getString()
	{
		Scanner in = new Scanner(System.in);
		original = in.nextLine();
	}

	public void getInt()
	{
		Scanner in = new Scanner(System.in);
		increment = in.nextInt();
		if (increment < 0)
			increment = increment % 26 + 26;
		else
			increment = increment % 26;
	}

	public void encryptString()
	{
		String encrypted = "";
		

		for (int x = 0; x < line.length(); x++) 
		{
			char ch = line.charAt(x);
			if (ch >= 'A' && ch <= 'Z') 
				ch = (char) ((ch - 'A' + increment) % 26 + 'A');
			else if (ch >= 'a' && ch <= 'z') 
				ch = (char) ((ch - 'a' + increment) % 26 + 'a'); 
			encrypted += ch;
		}
		line = encrypted;

	}

	public void printString(int number) 
	{
		System.out.println("\nEncryption " + number + ":\n" + line);
	}
}
