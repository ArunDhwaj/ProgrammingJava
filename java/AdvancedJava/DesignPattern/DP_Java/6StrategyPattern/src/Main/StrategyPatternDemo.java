package Main;

import java.util.Scanner;

import Choices.*;
import ContextOfChoice.*;


public class StrategyPatternDemo 
{
	
	public static void main(String[] args) 
	{
		System.out.println("***Strategy Pattern Demo***");
		
		Scanner in = new Scanner(System.in); //To take input from user
		IChoice ic = null;
		Context cxt = new Context();
		String input1,input2;;

		//Looping twice to test two different choices
		try
		{
//			for (int i = 1; i <= 2; i++)
			while(true)
			{
				System.out.println("Enter an integer:");
				input1 = in.nextLine();
				System.out.println("Enter another integer:");
				input2 = in.nextLine();
				System.out.println("Enter ur choice(1 or 2)");
				System.out.println("Press 1 for Addition, 2 for Concatenation, -1 for exit");
				String c = in.nextLine();
				
				/*For Java old versions-use these lines to collect input
				from user
				BufferedReader br = new BufferedReader
				( new InputStreamReader( System.in ));
				String c = br.readLine();*/
				
				if (c.equals("1"))
				{
					/*If user input is 1, create object of FirstChoice
					(Strategy 1)*/
					ic = new FirstChoice();
				}
				else
				{
					/*If user input is 2, create object of SecondChoice
					(Strategy 2)*/
					ic = new SecondChoice();
				}
				
				/*Associate the Strategy with Context*/
				cxt.SetChoice(ic);
				cxt.ShowChoice(input1,input2);
				
				
				if (c.equals("-1"))
				{
					break;
				}
			}
		}
		finally
		{
			in.close();
		}
		
		System.out.println("End of Strategy pattern");
	}
}
