package co1Assignment;
import java.util.Scanner;
import java.time.Duration;
import java.time.LocalTime;
public class hoursWorked {
	
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter start time (HH:mm): ");
	        LocalTime start = LocalTime.parse(sc.nextLine());

	        System.out.print("Enter end time (HH:mm): ");
	        LocalTime end = LocalTime.parse(sc.nextLine());
	        int startMinutes = start.getHour() * 60 + start.getMinute();
	        int endMinutes = end.getHour() * 60 + end.getMinute()+1440;
	        int totalMinutes = endMinutes - startMinutes;
	        Duration duration = Duration.ofMinutes(totalMinutes);

	        

	        System.out.printf("Total hours worked: %.2f hours%n", duration.toMinutes() / 60.0);

	        sc.close();
	    
	}

	
	

}
