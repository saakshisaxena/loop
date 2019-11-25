import java.util.Scanner;
import javax.swing.*;
 //Class to print a version of the rhyme "10 in the bed"
class loop
{
	//method main to manage all the different methods
	public static void main(String[] param)
	{
		int x = inputInt("How many are there in the bed?");
		looping(x);
		return;
	}//end of main

	//method to print the required number of times
	public static void looping(int n)
	{
		for(int i=n ; i>1; i--)
		{
		print("There were "+i+" in the bed and the little one said \n Roll over, Roll over. \n So they all rolled over and one fell down.");
		}

		print("There was 1 in the bed and the little one said \n Good Night");
		return;
	}//end of method looping

	//method to print
	public static void print(String message)
	{
		System.out.println("\n"+message+"\n");
		return;
	}


	//method to take input from the user and convert it into an interger
	public static int inputInt(String s)
	{
		Scanner scanner= new Scanner(System.in);
		print(s);
		String a= scanner.nextLine();
		int b= Integer.parseInt(a);
		return b;
	}//end of input method



}//end of class loop
