package withOutDependencies;

public class Car {
	Engine engine = new Engine();
		public void drive() {
			engine.start();
			System.out.println("Car is running.....");
		}
}
