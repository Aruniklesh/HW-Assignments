package week1.assignments;


	public class RemoveDuplicateWords {

		public static void main(String[] args) {
		String text="We learn Java basics as part of java sessions in java week1";
	    String arr[]=text.split(" ");
	    
	    for(int i=0; i<arr.length;i++) {  
	    	
	    	for(int j=i+1; j<arr.length;j++) {
	    		
	    		if(arr[i].equalsIgnoreCase(arr[j])) {
	    			arr[j]= " ";
	    		}	
	    	}
	    }
	    for(int i=0; i<arr.length;i++) {
	    	
	    	System.out.print(arr[i] +" ");
	    }
		}

	}
