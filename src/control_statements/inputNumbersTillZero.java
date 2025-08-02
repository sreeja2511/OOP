package control_statements;
import java.util.*;
public class inputNumbersTillZero {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter numbers (enter 0 to stop):");
	        int input;
	        do {
	            input = sc.nextInt();
	            if (input != 0) {
	                System.out.println("You entered: " + input);
	            }
	        } while (input != 0);
	}

}
