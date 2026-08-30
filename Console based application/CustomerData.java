//package cba;
//
//import java.util.Scanner;
//
//class CustomerD{
//    String cusName;
//    String cusPhNo;
//    int cusAge;
//    int cusId;
//    Customer[] cusArr = new Customer[100];
//    int index = 0;  
//    Customer(){    
//    }
//    
//    Customer(String name,String phno,int age,int id){
//        this.cusName = name;
//        this.cusPhNo = phno;
//        this.cusAge = age;
//        this.cusId = id+1;
//    }
//    
//    void createCustomer(){
//        Scanner in  = new Scanner(System.in);
//        System.out.println("Enter the customer name: ");
//        String name = in.nextLine();
//        System.out.println("Enter the customer number: ");
//        String phno = in.nextLine();
//        System.out.println("Enter the customer age: ");
//        int age = in.nextInt();
//        Customer cus = new Customer(name,phno,age,index);
//        cusArr[index] = cus;
//        index++;
//        System.out.println("Customer Created Successfully");
//   
//    }
//    void getCusById() {
//    	Scanner in = new Scanner(System.in);
//    	System.out.println("Enter the customer id: ");
//    	int id =in.nextInt();
//    	System.out.println(cusArr[id].cusName);
//        System.out.println(cusArr[id].cusPhNo);
//        System.out.println(cusArr[id].cusAge);
//    	
//    }
//    
//    void displayCustomer(){
//        for(int i=0;i<index;i++){	
//            System.out.println(cusArr[i].cusName);
//            System.out.println(cusArr[i].cusPhNo);
//            System.out.println(cusArr[i].cusAge);
//        }
//    }
//    
//}
//
//class Products{
//	int proId;
//    String prdName;
//    int proPrice;
//	int proStock;
//    
//    Product[] prdArr = new Product[100];
//    int index = 0;
//	
//    Product(){ 
//    }
//    
//    Product(int id,String name,int rate,int stock){
//    	this.proId=id;
//        this.prdName = name;
//        this.proPrice = rate;
//        this.proStock;
//    }
//    
//    void createProduct(){
//        Scanner in  = new Scanner(System.in);
//        System.out.println("Enter the product name: ");
//        String name = in.nextLine();
//        System.out.println("Enter the product rate : ");
//        int price = in.nextInt();
//        System.out.println("Enter the Pro stock:"); 
//        int stock = in.nextInt();
//     
//        Product prd = new Product(index,name,price,stock);
//        prdArr[index] = prd;
//        index++;
//        System.out.println("Product Created Successfully");
//  
//    }
//    
//    void displayProduct(){
//        for(int i=0;i<index;i++){	
//            System.out.println(prdArr[i].prdName);
//            System.out.println(prdArr[i].proId);
//            System.out.println(prdArr[i].proPrice);
//            System.out.println(prdArr[i].proStock);
//
//        }
//    }
//    
//}
//
//class Bill{ 
//    int billId; 
//    int cusId; 
//    BillProduct bpObj; 
//    int noOfproduct; 
//    Bill[] billArr = new Bill[100]; 
//    int index=0; 
//     
//    Bill(){ 
//         
//    } 
//     
//    Bill(int billId,int cusId,BillProduct obj,int n){ 
//        this.billId=billId; 
//        this.cusId = cusId; 
//        this.bpObj = obj; 
//        this.noOfproduct=n; 
//    } 
//     
//     
//    void createBill(Product proObj){ 
//        Scanner in = new Scanner(System.in); 
//        
//        System.out.println("Enetr the customer id: "); 
//        int id = in.nextInt(); 
//        
//        System.out.println("Enter the no of products: "); 
//        int n = in.nextInt(); 
//        
//        BillProduct bp = new BillProduct(); 
//        
//        for(int i=0;i<n;i++){ 
//            
//            System.out.println("Enter the Product Id: "); 
//            int proId = in.nextInt(); //0
//            
//            System.out.println("Enter the Product qua: "); 
//            int proQua = in.nextInt(); //2
//            
//            proObj.prdArr[proId].proStock-=proQua;
//            
//            BillProduct bplist = new BillProduct(proId,proQua); 
//            bp.billproArr[i] = bplist; 
//        } 
//        
//        Bill bill = new Bill(index,id,bp,n); 
//        billArr[index] = bill; 
//        index++; 
//        
//        System.out.println("Bill Created Successfully"); 
//    } 
//     
//     
//    void displayBill(Product prd){ 
//        
//        for(int i=0;i < index;i++){ 
//           
//            System.out.println("Bill ID: " + billArr[i].billId); 
//            System.out.println("Customer ID: " + billArr[i].cusId); 
//            
//            for(int j=0;j<billArr[i].noOfproduct;j++){ 
//                
//                int productId = billArr[i].bpObj.billproArr[j].proId; 
//                int quantity = billArr[i].bpObj.billproArr[j].proQua; 
//                
//            
//                if(productId >= 0 && productId < prd.index){ 
//                    
//                    System.out.println("Product ID: " + productId); 
//                    System.out.println("Product Name: " + prd.prdArr[productId].prdName); 
//                    System.out.println("Price: " + prd.prdArr[productId].proPrice); 
//                    System.out.println("Quantity: " + quantity); 
//                    
//                    int total = prd.prdArr[productId].proPrice * quantity; 
//                    
//                    System.out.println("Total: " + total); 
//                    
//                    
//                }else{ 
//                    System.out.println("Product not Found"); 
//                } 
//            } 
//        } 
//    } 
//} 
//
//
//class BillProduct{ 
//    int proId; 
//    int proQua; 
//    BillProduct[] billproArr = new BillProduct[100]; 
//    
//    BillProduct(){ 
//         
//    } 
//    
//    BillProduct(int id,int qua){ 
//        this.proId = id; 
//        this.proQua = qua; 
//    } 
//     
//} 
//
//
//public class CustomerData
//{
//	public static void main(String[] args) {
//	    int n;
//	    Scanner in = new Scanner(System.in);
//	    Customer cus = new Customer();
//	    Product prd = new Product();  
//	    Bill bill = new Bill();
//	    while(true){
//	        System.out.println(" 1)Create Customer\n 2)Display Customer\n 3)Create Product\n 4)Display Product\n 5)Create Bill\n 6)Display Bill");
//	        n = in.nextInt();
//	        
//	        switch(n){
//	            case 1:{
//	                cus.createCustomer();
//	                break;
//	            }
//	            case 2:{
//	                cus.displayCustomer();
//	                break;
//	            }
//	            case 3:{
//	                prd.createProduct();
//	                break;
//	            }
//	            case 4:{
//	                prd.displayProduct();
//	                break;
//	            }
//	            case 5:{ 
//                    bill.createBill(prd); 
//                    break; 
//                } 
//                
//                case 6:{ 
//                    
//                    bill.displayBill(prd); 
//                    break; 
//                } 
//	            
//	        }
//	    }
//
//	}
//	
//	
//}