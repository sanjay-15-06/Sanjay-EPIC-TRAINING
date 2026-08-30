package interfaceconcept;
class Employee1{
    private String name;
    private int id;
    
    Employee1(String n,int id){
        this.name = n;
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String n){
        this.name = n;
    }
}
public class Acessmodifier_backend {

	public static void main(String[] args) {
		Employee1 emp = new Employee1("Dharaneesh",123);
		System.out.println(emp.getName());
		emp.setName("Naveen");
		System.out.println(emp.getName());
		
	}
}


