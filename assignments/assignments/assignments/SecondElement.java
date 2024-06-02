package week2.assignments;

import java.util.Arrays;

public class SecondElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] =  {3, 2, 11, 4, 6, 7};
		Arrays.sort(array);
		int secondelement = array[array.length-2];
		System.out.println("The Second Highest Element from an array is: " + secondelement);

	}

}
