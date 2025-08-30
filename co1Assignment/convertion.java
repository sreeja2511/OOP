package co1Assignment;
import java.util.*;
public class convertion {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		float tempf=Float.parseFloat(a);
		double tempd=Double.parseDouble(a);
		int tempInt=(int)tempd;
		System.out.println(tempf);
		System.out.println(tempd);
		System.out.println(tempInt);
	}

}
