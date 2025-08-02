package myproject;
import java.util.*;
public class greatestno {
    public static void main(String args[]) {
    	Scanner sc=new Scanner(System.in);
    	int a=sc.nextInt();
    	int b=sc.nextInt();
    	int c=sc.nextInt();
    	if(a>b && a>c) {
    		System.out.println("A");
    	}
    	else if(b>c && b>a) {
    		System.out.println("B");
    	}
    	else {
    		System.out.println("C");
    	}
    }
}
//automatic conversion-typeconvertion
//manual conversion -typecasting
//Widening conversion-small->larger typeconvertion
/* narrowing conversion -typecasting*/