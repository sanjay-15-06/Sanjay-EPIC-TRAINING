package main;

import java.util.Scanner;

import controller.CustomerController;
import services.CustomerService;

public class BillingMain {

	public static void main(String[] args) {
		CustomerService cc = new CustomerController();
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.println("=============================================================");
			System.out.println(" 1.Create Customer \n 2.Display Customer \n 3.Update details \n 4.Delete Customer");
			System.out.println("=============================================================");
			int n = in.nextInt();
			switch (n) {
				case 1: {
					cc.createCustomer();
					break;
				}
				case 2:{
					cc.displayCustomer();
					break;
				}
				case 3:{
					cc.updateCustomer();					
					break;
				}
				case 4:{
					cc.deleteCustomer();
					
				}
				
			}	

		}
	}

}

/*  output
=============================================================
1.Create Customer 
2.Display Customer 
3.Update details 
4.Delete Customer
=============================================================
1
-------------------------------------------------
Enter the Customer Name: 
sanjay
Enter the Mail id: 
sanju123@gmail.com
Customer Created Successfullyy...
-------------------------------------------------
=============================================================
1.Create Customer 
2.Display Customer 
3.Update details 
4.Delete Customer
=============================================================
1
-------------------------------------------------
Enter the Customer Name: 
sandy
Enter the Mail id: 
sandy@gmail.com
Customer Created Successfullyy...
-------------------------------------------------
=============================================================
1.Create Customer 
2.Display Customer 
3.Update details 
4.Delete Customer
=============================================================
1
-------------------------------------------------
Enter the Customer Name: 
mohith
Enter the Mail id: 
mohith@gmail.com
Customer Created Successfullyy...
-------------------------------------------------
=============================================================
1.Create Customer 
2.Display Customer 
3.Update details 
4.Delete Customer
=============================================================
2
-------------------------------------------------
0
sanjay
sanju123@gmail.com
-------------------------------------------------
-------------------------------------------------
1
sandy
sandy@gmail.com
-------------------------------------------------
-------------------------------------------------
2
mohith
mohith@gmail.com
-------------------------------------------------
=============================================================
1.Create Customer 
2.Display Customer 
3.Update details 
4.Delete Customer
=============================================================
3
Enter Customer id to delete: 
2
-------------------------------------------------
1.Change Name 
2.Change MailId 
1
Enter name to be changed: 
mohit
Name changed successfully
-------------------------------------------------
=============================================================
1.Create Customer 
2.Display Customer 
3.Update details 
4.Delete Customer
=============================================================
2
-------------------------------------------------
0
sanjay
sanju123@gmail.com
-------------------------------------------------
-------------------------------------------------
1
sandy
sandy@gmail.com
-------------------------------------------------
-------------------------------------------------
2
mohit
mohith@gmail.com
-------------------------------------------------
=============================================================
1.Create Customer 
2.Display Customer 
3.Update details 
4.Delete Customer
=============================================================
*/