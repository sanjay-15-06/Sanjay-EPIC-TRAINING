package oops;


abstract class EmpMethods{
    abstract void paymentCalculation();
}

class EmployeeData{
    String empName;
    EmployeeData(String n){
        this.empName = n;
    }
    
}

class FreeLancePayment extends EmployeeData{
	int salary;
    FreeLancePayment(String n,int s){
        super(n);
        this.salary=s;
    }
    
    int PaymentCalulation(int salary) {
    	int hours = 6;
    	int Total = salary*hours;
		return Total;
    	
    }
    
    
}
class FixedPayment extends EmployeeData{
    int salary;
    FixedPayment(String n,int s){
        super(n);
        this.salary=s;
    }
    
    int PaymentCalulation(int salary) {
    	int hours = 8;
    	int Total = salary*hours;
		return Total;
    	
    }
    
}
public class EmployeeD {

	public static void main(String[] args) {
		FreeLancePayment freep = new FreeLancePayment("sanjay", 1000);
		System.out.println(freep.empName);
		System.out.println(freep.PaymentCalulation(1000));
		System.out.println("-------------------------------------------------");
		FixedPayment fixp = new FixedPayment("santhosh", 2000);
		System.out.println(fixp.empName);
		System.out.println(fixp.PaymentCalulation(2000));

	}

}


