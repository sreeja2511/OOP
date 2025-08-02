
package myproject;

import java.util.Scanner;

public class employee {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee name:");
        String name = sc.nextLine(); // allows full name

        System.out.println("Enter employee ID:");
        int id = sc.nextInt();

        System.out.println("Enter contact number:");
        long no = sc.nextLong();

        sc.nextLine(); // consume leftover newline

        System.out.println("Enter department:");
        String dep = sc.nextLine();

        System.out.println("Enter years of experience:");
        float exp = sc.nextFloat();

        System.out.println("Enter salary:");
        double sal = sc.nextDouble();

        System.out.println("Is it full-time? (true/false):");
        boolean isFullTime = sc.nextBoolean(); // assuming a true/false input

        // Output
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Contact No.: " + no);
        System.out.println("Department: " + dep);
        System.out.println("Experience: " + exp + " years");
        System.out.println("Salary: ₹" + sal);
        System.out.println("Full-time: " + isFullTime);
    }
}


