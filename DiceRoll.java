import java.util.*;
import java.util.Scanner;
public class DiceRoll

{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Enter an integer");
		int number =sc.nextInt();
		int counter= 0;
		int ran1;
		int ran2;
		int ranumber;
		
		do
		{
			ran1 =rand.nextInt(6)+1;
			ran2 =rand.nextInt(6)+1;
			ranumber = ran1+ran2;
			counter +=1 ;
			
		} while (ranumber != number);
		System.out.println("It took "+ counter +" times for the die to role your number");
	}
}