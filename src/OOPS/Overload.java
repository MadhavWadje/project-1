package OOPS;

public class Overload {
	
public void add(int a,int b) {
	System.out.println(a+b);
}
	
public void add(int a,int b,int c) {
	System.out.println(a+b+c);
}
	
public static void main(String[] args) {
	Overload s=new Overload();
	s.add(10,20);
	s.add(10,20,20);
}
}
