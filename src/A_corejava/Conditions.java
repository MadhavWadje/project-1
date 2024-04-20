package A_corejava;

public class Conditions {
public static void main(String[] args) {
	//condition is true then use if condition
	int a=10;
	if(a<=20) {
		System.out.println(a);
	}
	
	//condition is true or false
	int b=20;
	if (b<=10) {
		System.out.println("if execute");
	}
	else {
		System.out.println("else Execute");
	}
	
	//multiple conditions
	int c=30;
	if (c<=20) {
		System.out.println("if execute");
	}
	else if(c==10){
		System.out.println("elseif1 execute");
	}
	else if(c==30){
		System.out.println("elseif2 execute");
	}
	else if(c<=50){
		System.out.println("elseif execute");
	}
	
	//Nested if: in condition another condition
	int d=40;
	if(d<=50) {
		System.out.println("nested if executed");
	
		if(d%2==0) {
			System.out.println("even");
	}
		else {
			System.out.println("Odd");
	}
	}
		else {
			System.out.println("else Executed");
	}
	}


}

            