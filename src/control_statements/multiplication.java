package control_statements;
import java.util.*;
public class multiplication {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		 System.out.print("Enter a number to print multiplication table: ");
	        int tableNum = sc.nextInt();
	        System.out.println("Multiplication Table of " + tableNum + ":");
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(tableNum + " x " + i + " = " + (tableNum * i));
	        }
	}

}
