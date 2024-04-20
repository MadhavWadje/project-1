package A_corejava;

import java.util.Scanner;

public class Switch {
public static void main(String[] args) {
	int a,b,ch;
	Scanner s=new Scanner(System.in);
	System.out.println("valve a");
	a=s.nextInt();
	
	System.out.println("valve b");
	b=s.nextInt();
	
	System.out.println("valve choice");
	ch=s.nextInt();
	
	switch(ch) {
	case 1:
		System.out.println(a+b);
       break;
	case 2:
		System.out.println(a-b);
       break;
	case 3:
		System.out.println(a*b);
       break;
	case 4:
		System.out.println(a/b);
       break;
       default:
       System.out.println("invalid choice");
	}
	
	
}
}
