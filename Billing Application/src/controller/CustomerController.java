package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.CustomerModel;
import services.CustomerService;

public class CustomerController implements CustomerService {
	ArrayList<CustomerModel> cusArr = new ArrayList<>(); 
	int id = 0;
	
	
	public void createCustomer() {
		Scanner in = new Scanner(System.in);
		System.out.println("-------------------------------------------------");
		System.out.println("Enter the Customer Name: ");
		String name = in.nextLine();
		System.out.println("Enter the Mail id: ");
		String mailId = in.nextLine();
		CustomerModel cm = new CustomerModel(name,mailId,id);
		cusArr.add(cm);
		System.out.println("Customer Created Successfullyy...");
		System.out.println("-------------------------------------------------");
		id++;
		
	}
	
	public void displayCustomer() {
		for(CustomerModel data : cusArr) {
			System.out.println("-------------------------------------------------");
			System.out.println(data.getCusId());
			System.out.println(data.getCusName());
			System.out.println(data.getCusMailId());
			System.out.println("-------------------------------------------------");
		}
	}
	
	public void updateCustomer() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Customer id to be changed: ");
		int id = in.nextInt();
		int index =0;
		for(CustomerModel cus : cusArr ) {
			if(cus.getCusId()==id) {
				while(true) {
					System.out.println("-------------------------------------------------");
					System.out.println(" 1.Change Name \n 2.Change MailId ");
					int n = in.nextInt();
					in.nextLine();
					switch(n) {
					   case 1:{
						System.out.println("Enter name to be changed: ");
						String name = in.nextLine();
						cusArr.get(id).setCusName(name);
						System.out.println("Name changed successfully");
						System.out.println("-------------------------------------------------");
					   	break;
					   }
					   case 2:{
						System.out.println("Enter mail to be changed: ");
						String mail = in.nextLine();
						cusArr.get(id).setCusMailId(mail);;
						System.out.println("Mail changed successfully");	
						System.out.println("-------------------------------------------------");
					   	break;
					   }
					}
					break;
				} 
			}
			index++;
		}
	}

	
	public void deleteCustomer() {
		Scanner in = new Scanner(System.in);
		System.out.println("-------------------------------------------------");
		System.out.println("Enter Customer id to delete: ");
		int id = in.nextInt();
		int index =0;
		for(CustomerModel cus : cusArr ) {
			if(cus.getCusId()==id) {
				cusArr.remove(index);
				System.out.println("Customer Removed Successfully");
				System.out.println("-------------------------------------------------");
				break;
				}
			index++;
		}
	}

}
