package myproject;
import java.util.*;//import alll classes by default
public class scannerexample {
	public static void main(String args[]) {
		System.out.println("enter a no.");
		Scanner sc=new Scanner(System.in);
		int val=sc.nextInt();
		double vald=sc.nextDouble();
		float no=sc.nextFloat();
	    long  nol=sc.nextLong();
	    String name=sc.nextLine();
		System.out.println("Integer "+val+" "+"double"+vald+" "+"float"+no+" "+"long"+nol+" "+"string"+name);
	}

}

