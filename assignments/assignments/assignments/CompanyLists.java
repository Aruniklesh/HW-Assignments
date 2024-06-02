package week2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompanyLists {

	public static void main(String[] args) {

        String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};
        
        List<String> companyList = new ArrayList<String>();

        for (String company : companies) {
        	  companyList.add(company);
        	}
        System.out.println(companyList);
        
     // Step 3: Print the required output in the specified order
        System.out.println(companyList.get(1) + ", " + 
						     companyList.get(0) + ", " + 
						     companyList.get(3) + ", " + 
						     companyList.get(2));
    }
        
	}
	


