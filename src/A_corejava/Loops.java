package A_corejava;

public class Loops {
public static void main(String[] args) {
	//While
	int a=10;
	while(a<=15){
	System.out.println(a);
	a++;
	}
	
	
	//do while
	int b=20;
	do {
		System.out.println(b);
		b++;
	}
	while(b<=25);
	
	
	//For loop: All things in one stmt
	for(int i=10; i<=12; i++) {
		System.out.println(i);
	}
	
	
	//for each
	int sub[]= {10,20,30,40,50};
	System.out.println(sub[1]);
	System.out.println(sub[0]+","+sub[4]);
	
	for(int s:sub) {
		System.out.println(s);
		}
	
	//Arraylist
	for(int i=0; i<=sub.length; i++) {
		System.out.println("Shubham"+sub[1]);
	}
	


}
}
