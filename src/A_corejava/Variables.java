package A_corejava;

public class Variables {
static int empid=100;
int b=20;
	public void m1() {
		int a=10;
		System.out.println("m1 executed");
		System.out.println("Local vaiable="+a);
		System.out.println("instance var="+b);
		System.out.println("static var="+empid);
	}
	public void m2() {
		System.out.println("m2 executed");
	}
	public void m3() {
		System.out.println("m3 executed");
	}
	public static void main(String[] args) {
		Variables s=new Variables();
		s.m1();
		s.m2();
		s.m3();
}
}