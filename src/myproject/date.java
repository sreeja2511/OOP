package myproject;
import java.util.*;
public class date {
	public static void main(String args[]) {
		Date d=new Date();
		System.out.println("current date and time is"+d);
		int month=d.getMonth();
		System.out.println("Month is "+month);
		int year=d.getYear();
		System.out.println("Year is "+year);
		System.out.println(d.getMinutes());
		System.out.println(d.getHours());
	}
	

}
