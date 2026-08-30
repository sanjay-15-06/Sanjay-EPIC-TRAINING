package consoleBasedApp;

class Value_Encapsulation {

	private int a;
	
	
	void setA(int a) {
		this.a = a;
	}
	
	int getA() {
		return a;
	}
	
}

public class Encapsulation{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Value_Encapsulation en = new Value_Encapsulation();
		
		//en.a = 10;
		
		en.setA(10);
		System.out.println(en.getA());
		
	}

}
