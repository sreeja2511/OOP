package arrays;
import java.util.Scanner;
public class studentmarks {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[6];
        int total = 0;

        System.out.println("Enter marks of 6 subjects:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        System.out.println("Marks of each subject:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }

        double average = total / 6.0;
        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);
    }

}
