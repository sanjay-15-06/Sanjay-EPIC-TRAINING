package consoleBasedApp;
import java.util.Scanner;

public class Constructor {

	public static void main(String[] args) {
		

		class Customer{
		    String cusName;
		    String cusPhNo;
		    int age;
		    
		    Customer(String a,String b,int c){
		        this.cusName = a;
		        this.cusPhNo = b;
		        this.age = c;
		    }
		}
		    
		    Customer(){
		        
		    }
		    
		    void createCustomer(){
		        
		        Scanner in = new Scanner(System.in);
		        System.out.println("Enter the customer name: ");
		        String name = in.nextLine();
		        System.out.println("Enter the customer phone number: ");
		        String phno = in.nextLine();
		        System.out.println("Enter the customer age: ");
		        int age = in.nextInt();
		        Customer cus = new Customer(name,phno,age);
		        System.out.println(cus.cusName);
		        System.out.println(cus.cusPhNo);
		        
		    }
		}

public class Main{
			public static void main(String[] args) {
				Customer cus1 = new Customer();
				cus1.createCustomer();
			}
	

	}


