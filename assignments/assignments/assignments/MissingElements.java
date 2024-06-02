package week2.assignments;

import java.util.Arrays;

public class MissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 1, 2, 3, 4, 10, 6, 8 };
		Arrays.sort(array);
		for (int i = 1; i < array.length; i++) 
		{
			int expectedNumber = array[i-1]+1;  //1+1
			if(array[i] != expectedNumber) {
		        System.out.print("Missing number(s): ");
	        while (array[i] != expectedNumber) {
		            System.out.print(expectedNumber + " ");
		            expectedNumber++;
		          }
		          System.out.println(); // Print newline after each missing number sequence
		        }
			}
		}
	}


