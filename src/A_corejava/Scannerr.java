package A_corejava;

import java.util.Scanner;

public class Scannerr {
public static void main(String[] args) {
	int a,b,c;
	System.out.println("value a & value b");
	
	Scanner sc=new Scanner (System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	c=a+b;
	System.out.println("Addition="+c);
	
}
}
