package myproject;
import java.util.*;
public class calendar {
	public static void main(String args[]) {
		Calendar c=Calendar.getInstance();
		Date d=c.getTime();
		System.out.println(d);
		c.set(2028,c.JULY,17);
		int year=c.getWeekYear();
		System.out.println(year);
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		System.out.println(c.get(Calendar.WEEK_OF_MONTH));
		System.out.println(c.get(Calendar.WEEK_OF_YEAR));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
		System.out.println(c.get(Calendar.AM_PM));
		int h=c.getFirstDayOfWeek();
		System.out.println(h);
        
		
	}

}
