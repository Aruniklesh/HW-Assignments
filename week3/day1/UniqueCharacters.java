package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueCharacters {

	public static void main(String[] args) {
        String companyName = "google";
        Set<Character> name= new LinkedHashSet<Character>();
        char[] names= companyName.toCharArray();
        for (int j = 0; j < names.length; j++) {
        	name.add(names[j]);
        	
		}
        System.out.println(name);
  /*   //we can get this by replace also
        String companyNames = "google";
        // Replace the second o   and g with an empty string
        String replaceString = companyNames.replaceFirst("o", "").replaceFirst("g", "");
        System.out.println(replaceString);
*/

    }

}
