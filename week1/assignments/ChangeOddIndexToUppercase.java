package week1.assignments;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		String text="changeme";
		  //Converted String to Char Array
		  char ch[]=text.toCharArray();
		  //filtering odd indexes
		  for(int i=1; i<ch.length; i=i+2) 
		  {
			 ch[i]= Character.toUpperCase(ch[i]);
		  }
	     System.out.println(String.valueOf(ch));
		}
	}


