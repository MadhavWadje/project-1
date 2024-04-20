package OOPS;

public class OverRide {
public void m1(int a,int b) {
	System.out.println(a+b);
	System.out.println("existing feature old car");
}

public class Override extends OverRide{
public void m1(int a,int b) {
	System.out.println(a-b);
	System.out.println("new feature new car");
}

public static void main(String args[]) {
OverRide s=new OverRide();
s.m1(10, 20);
	
}
}
}