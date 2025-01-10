import java.util.Scanner;

public class Encrypt 
{
    private String original;
    private String line;
    private int timesEncrypted;

    public Encrypt() 
    {
        original = "";
        line = "";
        timesEncrypted = 0;
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
        System.out.print("\nHow many letter increments do you want to have in the code (1-26)?\n\n-> ");
        getInt();
        
        for (int i = 1; !original.equals(line); i++) 
        {
            encryptString(i); // Pass 'i' to adjust encryption for each step
            printString(i);
        }
        
        System.out.println("\n\n\n");
    }

    public void getString()
    {
	    Scanner in = new Scanner(System.in);
        original = in.nextLine();
        line = original; // Set 'line' to the original string for encryption.
    }

    public void getInt()
    {
		Scanner in = new Scanner(System.in);
        timesEncrypted = in.nextInt();
    }

    public void encryptString(int increment)
    {
        String encrypted = "";
    
        for (int x = 0; x < line.length(); x++) 
        {
            char ch = line.charAt(x);
            if (ch >= 'A' && ch <= 'Z') 
                ch = (char) ((ch - 'A' + increment) % 26 + 'A'); // Increment by 'increment' steps
            else if (ch >= 'a' && ch <= 'z') 
                ch = (char) ((ch - 'a' + increment) % 26 + 'a'); // Increment by 'increment' steps
            encrypted += ch;
        }
        
        line = encrypted; // Update the line after encryption
    }

    public void printString(int number) 
    {
        System.out.println("\nEncryption " + number + ":\n" + line);
    }
}
