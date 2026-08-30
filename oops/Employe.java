package oops;


import java.util.*;

abstract class EmployeData {

    // Create variables
    int employeeId;
    String employeeName;
    double basicSalary;

    // Create constructor
    EmployeData(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    // Create method to display employee details
    void displayEmployee() {
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Basic Salary  : " + basicSalary);
    }

    // Create an abstract method for salary calculation
    // Each employee type should calculate salary differently
    abstract double calculate();
}


// Employee with fixed salary + bonus
class PermanentEmployee extends EmployeData {

    double bonus;

    PermanentEmployee(int employeeId, String employeeName,
                      double basicSalary, double bonus) {
    	super(employeeId, employeeName,basicSalary);
        this.bonus = bonus;
    }

    // Override the abstract method
    @Override
    double calculate() {
        return basicSalary+bonus;
    }
}


// Employee whose salary depends on hours worked
class ContractEmployee extends EmployeData {

    int hoursWorked;
    double hourlyRate;

    ContractEmployee(int employeeId, String employeeName,
                     double basicSalary, int hoursWorked,
                     double hourlyRate) {

    	super(employeeId, employeeName, basicSalary);
    	this.hourlyRate = hourlyRate;
    	this.hoursWorked = hoursWorked;
    }

    // Override the abstract method
    @Override
    double calculate() {
    	return hoursWorked*hourlyRate ; 
    }
}


public class Employe {

	public static void main(String[] args) {

        // Create Permanent Employee
        PermanentEmployee p = new PermanentEmployee(101, "Arun", 30000, 5000);

        // Create Contract Employee
        ContractEmployee c = new ContractEmployee(102, "Rahul", 0, 160, 250);


        // Display employee details
        p.displayEmployee();
        System.out.println("Total Salary : " + p.calculate());

        System.out.println();

        c.displayEmployee();
        System.out.println("Total Salary : " +c.calculate());
    }

}


