package myproject;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class chatgpt_date {

	    public static void main(String[] args) {
	        LocalDateTime now = LocalDateTime.now();  // Gets current date and time

	        System.out.println("Current date and time is: " + now);

	        int year = now.getYear();
	        int month = now.getMonthValue();  // 1 to 12
	        int day = now.getDayOfMonth();
	        int hour = now.getHour();
	        int minute = now.getMinute();

	        System.out.println("Year: " + year);
	        System.out.println("Month: " + month);
	        System.out.println("Day: " + day);
	        System.out.println("Hour: " + hour);
	        System.out.println("Minute: " + minute);

	        // Custom format
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	        System.out.println("Formatted: " + now.format(formatter));
	    }
	}

