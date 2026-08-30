package oops;


class Employee{
	String name;
	Employee(String name){
		this.name= name;
	}
}

class Payment extends Employee{
	int salary;
	Payment(String name,int salary){
		super(name);//directly access the parent class and pass the value
		this.salary=salary;
	}
}
public class SuperKeyWord {

	public static void main(String[] args) {
		Payment ptm = new Payment("Sanjay",1000);
		System.out.println(ptm.name);
		System.out.println(ptm.salary);

	}

}
