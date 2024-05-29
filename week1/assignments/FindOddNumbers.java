package week1.assignments;

public class FindOddNumbers {

	public static void main(String[] args) {
		int maxRange = 10;
		System.out.println("The Odd Numbers from 1 to 10 is: ");
		for (int i = 0; i <=maxRange; i++) {
			if(i%2 != 0) {   
				//Divide the number by 2 and if the remainder is 1 -> the number is odd.
				
				System.out.print(" "+i);
			}
		}
	}

}
