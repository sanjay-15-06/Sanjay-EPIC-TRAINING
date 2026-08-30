package withDependencies;

public class Main {

	public static void main(String[] args) {
		Engine engine = new Engine();
		
		
		//Object dependency injection
		Car car = new Car(engine);
		
		car.drive();

	}

}
