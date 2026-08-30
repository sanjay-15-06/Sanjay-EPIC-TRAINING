package cba;

import java.util.Scanner;
class Customer{
	int cusId;
	String cusName;
	String cusPhno;
	int cusAge;
	int index=0;
	Customer[] cusArr = new Customer[100];
	
	Customer(){
		
	}
	
	Customer(int id,String name,String phno,int age){
		this.cusId =id;
		this.cusName=name;
		this.cusPhno=phno;
		this.cusAge = age;
	}
	
	void createCustomer(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Customer name: ");
		String name = in.nextLine();
		System.out.println("Enter Customer phno: ");
		String phno = in.nextLine();
		for(;;) {
			try {
				if(phno.length()<10) {
					throw new ArithmeticException();
				}else {
					System.out.println("Valid phno");
					break;
				}
			}catch(Exception e) {
				System.out.println("Enter 10 digit phno");
				phno = in.nextLine();
			}
		}
		System.out.println("Enter age: ");
		int age = in.nextInt();
			for(;;) {
			try {
				if(age<18) {
					throw new ArithmeticException();
				}else {
					System.out.println("Valid age");
					break;
				}
			}catch(Exception e) {
				System.out.println("Enter valid age: ");
				age = in.nextInt();
			}
		}
		Customer cus = new Customer(index,name,phno,cusAge);
		cusArr[index]=cus;
		index++;
		System.out.println("Customer Created Successfully");
		System.out.println();
		
	}
	void displayCustomer(){
		for(int i =0;i<index;i++) {
			System.out.println("Customer Name: " +cusArr[i].cusName);
			System.out.println("Customer phno: "+cusArr[i].cusPhno);
			System.out.println("Customer age: "+cusArr[i].cusAge);
			System.out.println();
		}
	}
}

class Product {
	int proId;
	String proName;
	int proPrice;
	int proStock;
	int index=0;
	Product[] proArr = new Product[100];
	
	Product(){
		
	}
	
	Product(int id,String name,int price,int stock){
		this.proId =id;
		this.proName=name;
		this.proPrice=price;
		this.proStock = stock;
	}
	
	void createProduct(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Products name: ");
		String name = in.nextLine();
		System.out.println("Enter Products price: ");
		int price = in.nextInt();
		System.out.println("Enter Products stock: ");
		int stock = in.nextInt();
		
		Product pro = new Product(index,name,price,stock);
		proArr[index]= pro;
		index++;
		System.out.println("Customer Created Successfully");
		System.out.println();
		
	}
	
	void displayProduct(){
		for(int i =0;i<index;i++) {
			System.out.println("Product Id: "+proArr[i].proId);
			System.out.println("Product Name: "+proArr[i].proName);
			System.out.println("Product Name: "+proArr[i].proName);
			System.out.println("Stock Available: "+proArr[i].proStock);
			System.out.println();
		}
	}
	
}

class Bill{
	int billId;
	int cusId;
	int noOfPro;
	BillPro bpobj;
	Bill[] billArr = new Bill[100];
	int index = 0;
	
	Bill() {
		
	}
	Bill(int id,int cusId,BillPro obj,int item){
		this.billId = id;
		this.cusId =cusId;
		this.noOfPro = item;
		this.bpobj = obj;
	}
	
	void createBill(Product proObj) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Customer Id: ");
		int cusId = in.nextInt();
		System.out.println("Enter the No Of Products: ");
		int item = in.nextInt();
		BillPro bpr = new BillPro();
		
		for(int i=0;i<item;i++){ 
            
            System.out.println("Enter the Product Id: "); 
            int proId = in.nextInt(); //0
            
            System.out.println("Enter the Product qua: "); 
            int proQua = in.nextInt(); //2
            
            proObj.proArr[proId].proStock-=proQua;
            
            BillPro billProl = new BillPro(proId,proQua); 
            bpr.billProArr[i] = billProl; 
        } 
		Bill bill = new Bill(index,cusId,bpr,item); 
        billArr[index] = bill; 
        index++; 
        
        System.out.println("Bill Created Successfully"); 
        System.out.println();
	}
	
	
	void displayBill(Product pro) {
		for(int i=0;i < index;i++){ 
	        
            System.out.println("Bill ID: " + billArr[i].billId); 
            System.out.println("Customer ID: " + billArr[i].cusId); 
            int sum =0;
            for(int j=0;j<billArr[i].noOfPro;j++){ 
                
                int proId = billArr[i].bpobj.billProArr[j].proId; 
                int quantity = billArr[i].bpobj.billProArr[j].proQua; 
                
                System.out.println("-----------------------------------------");
                if(proId >= 0 && proId < pro.index){ 
                    
                    System.out.println("Product ID: " + proId); 
                    System.out.println("Product Name: " + pro.proArr[proId].proName);  
                    System.out.println("Price: " + pro.proArr[proId].proPrice); 
                    System.out.println("Quantity: " + quantity); 
                    
                    int total = pro.proArr[proId].proPrice * quantity; 
                    sum+=total;
                    System.out.println("Total: " + total); 
                    
                    
                }else{ 
                    System.out.println("Product not Found"); 
                } 
                System.out.println("-----------------------------------------");
                System.out.println("Total Bill: "+ sum);
                System.out.println("-----------------------------------------");
            } 
        }
	}
	
}

class BillPro{
	int proId;
	int proQua;
	BillPro[] billProArr = new BillPro[100];
	
	BillPro() {
		
	}
	BillPro(int id,int quantity){
		this.proId=id;
		this.proQua= quantity;
	}
}


public class BillingSystem {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Customer cus = new Customer();
		Product pro = new Product();
		Bill bill = new Bill();
		
		
		while(true){
			System.out.println("1.Create custommer\n2.Display customer\n3.Create Product\n4.Display Product\n5.Create Bill\n6.Display Bill");
			int n = in.nextInt();
			switch(n) {
				case 1 :{
					cus.createCustomer();
					break;
				}
				case 2:{
					cus.displayCustomer();
					break;
				}
				case 3:{
					pro.createProduct();
					break;
				}
				case 4:{
					pro.displayProduct();
					break;
				}
				case 5:{
					bill.createBill(pro);
					break;
				}
				case 6:{
					bill.displayBill(pro);
					break;
				}
			}
		}

	}

}
