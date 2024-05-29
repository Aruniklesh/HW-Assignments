package week1.assignments;
public class IsPrime {

	public static void main(String[] args) {
		int number = 13;
		int count = 0;
		
		for(int i=1; i<=number; i++) {
			if(number % i ==0) {
				count++;
			}
		}
		if(count ==2) {									
			//if prime means it is div by only itself and 1,so the count is 2
			System.out.println("The given number is Prime");
		}
		else{
			System.out.println("The given number is Not Prime");
		}
	}
}
