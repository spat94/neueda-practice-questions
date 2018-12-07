import java.util.Scanner;

public class PracticeMain {

	public static void main(String[] args) {
		
		int num2 = 1;
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		System.out.println("1");
		
		for(int num1 = 2; num1 <= input; num1++) //attempting to add output of each iteration of loop to sum of all previous iterations
		{	
			num2 = num2 + num1;
			System.out.println(num2);
		}
	}
}
