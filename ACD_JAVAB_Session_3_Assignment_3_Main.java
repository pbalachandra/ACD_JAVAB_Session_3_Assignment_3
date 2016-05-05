package session3;

import java.util.Random;
import java.util.Scanner;

public class ACD_JAVAB_Session_3_Assignment_3_Main 
{
	public static void main(String[] args) 
	{
		int n;
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		System.out.println("To Print a Random Number between 0 and given Number");
		System.out.println("---------------------------------------------------");
		System.out.print("Enter a Number : ");
		n = s.nextInt();
		s.close();
		System.out.println("Random Number between 0 and " + n + " : " + r.nextInt(n));
	}
}
