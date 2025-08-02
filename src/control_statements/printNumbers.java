package control_statements;
import java.util.*;
public class printNumbers {
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		 System.out.print("Enter N to print numbers from 1 to N: ");
	        int N = sc.nextInt();
	        System.out.println("Numbers from 1 to " + N + ":");
	        for (int i = 1; i <= N; i++) {
	            System.out.print(i + " ");
	        }
	        
	}

}
