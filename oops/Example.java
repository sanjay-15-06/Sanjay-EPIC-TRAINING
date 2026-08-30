package consoleBasedApp;

class CustomerInfo{
    String name;
    int age;
    //parameterized constructor
    CustomerInfo(String n,int a){
        this.name = n;
        this.age = a;
    }
    
    CustomerInfo(){
        
    }
    

}


public class Example {
	public static void main(String[] args) {
	    int a =10;
	    CustomerInfo  cus = new CustomerInfo("Dharaneesh",23);
	    CustomerInfo  cus1 = new CustomerInfo("Priya",24);
	    CustomerInfo  cus2 = new CustomerInfo("Naveen",23);
	  
	    CustomerInfo[] arr = {cus,cus1,cus2};
 		
 		for(int i=0;i<arr.length;i++){
 		    System.out.println(arr[i].name +" "+ arr[i].age );
 		}
 		
	}
}
