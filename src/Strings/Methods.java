package Strings;

public class Methods {
	 public static void main(String args[]) {
		 String str = "   Hello Java Programming   ";
		 System.out.println("Original String: '" + str + "'");
		 System.out.println("Uppercase: " + str.toUpperCase());
	        System.out.println("Lowercase: " + str.toLowerCase());
	        System.out.println("Length: " + str.length());
	        System.out.println("Character at index 6: " + str.charAt(6));
	        System.out.println("Substring (6 to 10): " + str.substring(6, 10));
	        System.out.println("Index of 'Java': " + str.indexOf("Java"));
	        System.out.println("Replace 'Java' with 'World': " + str.replace("Java", "World"));



	 }


}
