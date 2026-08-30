package oops;

class MarutiSuzuki{
	void PD(){
		System.out.println("This car is ");
	}
}
class Baleno extends MarutiSuzuki{
	void PrintD() {
		System.out.println(" Baleno");
	}
}

class Ciaz extends MarutiSuzuki{
	void PrintD() {
		System.out.println(" Ciaz");
	}
}

class HatchBack extends Baleno {
	void Hatch() {
		System.out.println("This is more Comfort.......");
	}
}

class Sedan extends Ciaz{
	void sed() {
		System.out.println("This is a Sedan Car ");
	}
}

class Performance extends Sedan{
	void Perform() {
		System.out.println("This is Ultimate For sports...");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		HatchBack hb = new HatchBack();
		hb.PD();
		hb.PrintD();
		hb.Hatch();
		System.out.println("------------------------------------");
		Performance pm = new Performance();
		pm.PD();
		pm.PrintD();
		pm.sed();
		pm.Perform();

	}

}
