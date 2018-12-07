import java.util.Scanner;

public class HigherLowerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int number = 10; 
		int counter = 0;
		boolean solved = false; //Initialising variables here	
		
		while(solved == false)
		{
			System.out.println("Guess a number");
			int input = sc.nextInt();
			
			counter ++;
			
			if(input < number)
			{
				System.out.println("Too low; try again!");
				solved = false;
			}
			else if(input > number)
			{
				System.out.println("Too high; try again!");
				solved = false;
			}
			
			else if(input == number)
			{
				System.out.println("Correct! You guessed in " + counter + " attempts.");
				solved = true;
			}
		}
	}

}
