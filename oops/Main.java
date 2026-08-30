package consoleBasedApp;

class Customer{
    String name;
    int age;
    //parameterized constructor
    Customer(String n,int a){
        this.name = n;//this keyword refers to the current class object
        this.age = a;
    }
}


public class Main {

	public static void main(String[] args) {
		
			    String cusName = "Dharaneesh";
			    int age = 23;
			    Customer  cus = new Customer(cusName,age);
			    
		 		System.out.println(cus.name);
		 		System.out.println(cus.age);
		 		
			}
		

}


