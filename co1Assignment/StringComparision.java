package co1Assignment;

public class StringComparision {
	
	    public static void main(String[] args) {
	        String str1 = "Hello World";
	        String str2 = "hello world";
	        String str3 = "Hello World";

	        System.out.println("str1 == str2: " + (str1 == str2));   
	       /*== compares references (memory addresses), not content. 
	        * Here, str1 and str2 are different strings (case matters)
	        * so they point to different objects. Even if content is same
	        * case difference means no string pool reuse.
	        */

	        System.out.println("str1 == str3: " + (str1 == str3));   // true, same string literal in pool

	        System.out.println("str1.equals(str2): " + str1.equals(str2)); // false, case-sensitive content 
	        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true, same content

	        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2)); // negative because 'H' < 'h' 
	        System.out.println("str2.compareTo(str3): " + str2.compareTo(str3)); // positive because 'h' > 'H'
	    }
	}



