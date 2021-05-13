package _00_Intro_To_ArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
    public static void main(String[] args) {
        // 1. Create an array list of Strings
        //    Don't forget to import the ArrayList class
    	ArrayList <String> names = new ArrayList<String>();
        // 2. Add five Strings to your list
    	names.add("Billy");
    	names.add("Bob");
    	names.add("Joe");
    	names.add("Duncan");
    	names.add("Scott");
        // 3. Print all the Strings using a standard for-loop
    	for (int i = 0; i < names.size(); i++) {
			String s = names.get(i);
    		System.out.println(s);
		}
        // 4. Print all the Strings using a for-each loop
    	for (String s : names) {
    		
    		System.out.println(s);
    		
    	}
        // 5. Print only the even numbered elements in the list.
    	
        // 6. Print all the Strings in reverse order.

        // 7. Print only the Strings that have the letter 'e' in them.
        
    }
}
