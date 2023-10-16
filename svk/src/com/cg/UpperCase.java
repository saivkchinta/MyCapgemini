package com.cg;

public class UpperCase {
		public static void main(String[] args) {

			String input = "rahulsachinvinodanil";
			String s = input.substring(0, 5);
			System.out.println(s);

	       /* String[] words = input.split(" ");

	        StringBuilder result = new StringBuilder();

	        for (String word : words) {

	            if (word.length() > 0) {
	            	
	                char firstChar = Character.toUpperCase(word.charAt(0));

	                String restOfWord = word.substring(1).toLowerCase();

	                String capitalizedWord = firstChar + restOfWord;

	                result.append(capitalizedWord).append(" ");

	            }
	        }

	       String capitalizedString = result.toString().trim();

	        System.out.println(capitalizedString);

	    }
*/
		}}
