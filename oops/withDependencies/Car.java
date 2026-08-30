package withDependencies;

public class Car {
	
	
	private Engine engine; // class 
	
	
	//contructor dependency injection
	public Car(Engine engine) {
		this.engine = engine; //Reference Object
	}
	
	public void drive() {
		engine.start();
		System.out.println("Car is running....");
	}
}
