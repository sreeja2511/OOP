package co1Assignment;
import java.util.Scanner;
import java.util.Arrays;

public class salesManagement {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        final int MONTHS = 12; 
	        System.out.print("Enter number of salespersons: ");
	        int salespersons = sc.nextInt();
	        double[][] salesData = new double[salespersons][MONTHS];
	        for (int i = 0; i < salespersons; i++) {
	            System.out.println("Enter sales data for Salesperson " + (i + 1) + ":");
	            for (int j = 0; j < MONTHS; j++) {
	                System.out.print("Month " + (j + 1) + ": ");
	                salesData[i][j] = sc.nextDouble();
	            }
	        }
	        System.out.printf("%-12s", "Salesperson");
	        for (int j = 0; j < MONTHS; j++) System.out.printf("%-10s", "M" + (j + 1));
	        System.out.printf("%-10s%-10s%-12s%n", "Total", "Average", "Performance");
	        for (int i = 0; i < salespersons; i++) {
	            double total = Arrays.stream(salesData[i]).sum();
	            double average = total / MONTHS;
	            String performance = classifyPerformance(average);

	            System.out.printf("%-12s", "SP" + (i + 1));
	            for (int j = 0; j < MONTHS; j++) System.out.printf("%-10.2f", salesData[i][j]);
	            System.out.printf("%-10.2f%-10.2f%-12s%n", total, average, performance);
	        }

	        sc.close();
	    }

	    private static String classifyPerformance(double avg) {
	        if (avg >= 10000) return "Excellent";
	        if (avg >= 7000) return "Good";
	        if (avg >= 4000) return "Average";
	        return "Poor";
	    }
	}



