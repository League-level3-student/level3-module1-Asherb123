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
    		//System.out.println(s);
		}
        // 4. Print all the Strings using a for-each loop
    	for (String s : names) {
    		
    		//System.out.println(s);
    		
    	}
        // 5. Print only the even numbered elements in the list.
    	for (int i = 0; i < names.size(); i++) {
			String a = names.get(i);
    		
    		if (i%2==0) {
				//System.out.println(a);
			}
		}
        // 6. Print all the Strings in reverse order.
    	for (int i = names.size()-1; i >= 0 ; i--) {
    		String a = names.get(i);
    		
    		//System.out.println(a);
		}
        // 7. Print only the Strings that have the letter 'e' in them.
    	for (int i = 0; i < names.size(); i++) {
			
    		String a = names.get(i);
    		if (a.contains("e")==true) {
				
				System.out.println(a);
			}
		}
    }
}
