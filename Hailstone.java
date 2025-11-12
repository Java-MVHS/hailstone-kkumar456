// Kushagr Kumar
// 11/7/25
// Hailstone.java
// Working on: If statements and While loops

import java.util.Scanner;

public class Hailstone
{
	//FV's
	private int loopnum = 0; 
	private int input = 0;
	
	//main constructor
	public Hailstone()
	{
		loopnum = 0;
		input = 0;
	}
	
	//run findIt
	public static void main (String[] args)
	{
		Hailstone hs = new Hailstone();
		hs.findIt();
	}
	
	//take input and calculate it
	public void findIt()
	{
		do
		{
			getInput();
			if (input != -1)
			{
				printSequence();
			}
			
			printCount();
			
		} while(input != -1);
	}
	
	public void getInput()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("\n\nWelcome to Hailstone!\n\nPlease enter a positive integer betweeen"
		+ " 1-10000. To quit, enter the value -1:\t");
		input = keyboard.nextInt();

	}
	
	public void printSequence()
	{
		while(input > 1)
		{
			System.out.printf("%8d", input);
			if (input % 2 == 0)
			{
				input /= 2;
				loopnum += 1;
			}
			else if (input == 1)
			{
				System.out.print("1");
				loopnum += 1;
			}
			else
			{
				input = 3*input+1;
				loopnum += 1;
			}
				
			
			if (loopnum%10 == 0)
			{
				System.out.print("\n");
			}
			
				
		}
		
		System.out.printf("%5s", "1");	
		loopnum++;	
		
	}
	
	public void printCount()
	{
		if (input < -1 || input == 0 || input >= 10000)
		{
			System.out.println("\nEnter a value withn the valid range!");
		}
		else if (input == -1)
		{
			System.out.println("\nThanks for playing Hailstone.\n\n\n");
		}
		else
			System.out.println("\n\nThe loop executed " + loopnum + " times.\n\n");
	}
}
