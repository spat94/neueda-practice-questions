import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HighandLowMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> input = new ArrayList<Integer>();
		
		System.out.println("Enter 7 numbers");
		
		input.add(sc.nextInt());
		input.add(sc.nextInt());
		input.add(sc.nextInt());
		input.add(sc.nextInt());
		input.add(sc.nextInt());
		input.add(sc.nextInt());
		input.add(sc.nextInt());
		
		sc.close();
		System.out.println("Largest Number Is " + Collections.max(input));
		System.out.println("Smallest Number Is " + Collections.min(input));
	}

}
