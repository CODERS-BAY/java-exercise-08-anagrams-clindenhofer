package anagram;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramFinder {

	
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Please enter the first string: ");
    	String string1 = scanner.nextLine();
    	
    	System.out.println("Please enter the second string: ");
    	String string2 = scanner.nextLine();
    	
    	string1 = string1.replaceAll("\\s", "").toLowerCase();
    	string2 = string2.replaceAll("\\s", "").toLowerCase();
    	
    	if(areAnagrams(string1, string2)) {
    		System.out.println("The strings " + string1 + " and " + string2 + " are anagrams!");    		
    	}else {
    		System.out.println("The strings " + string1 + " and " + string2 + " are not anagrams!");
		}

    }


    public static boolean areAnagrams(String string1, String string2) {
    	
    	if(string1.length() != string2.length()) {
    		return false;
    	}else {
    		char [] string1Array = string1.toCharArray();
    		char [] string2Array = string2.toCharArray();
    		
    		Arrays.sort(string1Array);
    		Arrays.sort(string2Array);
    		
    		return Arrays.equals(string1Array, string2Array);
    	}
    }


}
