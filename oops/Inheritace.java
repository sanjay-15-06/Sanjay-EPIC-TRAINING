package oops;


class A{
	void printData(String  a) {
		System.out.println(a);
		System.out.println(a+ "hello");
	}
}

class B extends A{
	void printData() {
		int b = 10;
		System.out.println(b);
		System.out.println("welcome");
	}
}
class C extends B{
	void PrintData() {
		int c =20;
		System.out.println(c);
		System.out.println("to Java");
	}
}

public class Inheritace {
	

	public static void main(String[] args) {
		B b = new B();
		b.printData("hi");
		b.printData();
		C c = new C();
		c.printData("hi");
		c.printData();
		c.PrintData();
	}

}
