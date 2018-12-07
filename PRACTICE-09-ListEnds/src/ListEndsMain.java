import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class ListEndsMain {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
			
		Collections.addAll(list, 11, 11, 14, 10, 9, 2, 11, 9, 1, 14, 0, 19, 18, 13, 11, 17, 1, 3, 16);
		//adding initial list from which sub list will be generated using first and last elements
		Integer first = list.get(0);
		Integer last = list.get(list.size()-1); //gets first and lastr elements from array list and stores as
												//variables; list.size()-1 necessary as array list is 0 indexed
		
		ArrayList<Integer> subList = new ArrayList<Integer>();
		subList.add(first);
		subList.add(last); //adds generated first and last elements from "list" to new array list; same code will
						   //work regardless of what numbers are added to arraylist "list"
		
		System.out.println(subList);
	}

}
