package week1.assignments;

import java.util.Iterator;

public class Fibonacci {

	public static void main(String[] args) {
     int num = 8; //initalize the number which we need to generate the fibonacci series
     int firstNum=0,  secondNum=1;
     for (int i = 1; i <num ; i++) {
    	 
    	 System.out.print(" "+secondNum);
    	 
    	 int next = firstNum+secondNum;   //assigning 1 and 2 with other(next) variable
    	 firstNum= secondNum;            //second as first
    	 secondNum=next;				//next as second 
        
	}
     
     
	}

}
