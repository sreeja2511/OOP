package co1Assignment;
import java.util.*;
public class checknum {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(isPrime(num) && num<100 && num%2!=0 && num%5!=0 ) {
			System.out.println("num is satisfying all conditions");
		}
		else {
			System.out.println("num is satisfying all conditions");
		}
		
	}
	static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

}
