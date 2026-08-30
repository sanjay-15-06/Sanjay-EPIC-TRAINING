package oops;

abstract class MyData1{
    abstract void display();
}
class MyData2 extends MyData1{
    void display(){
        System.out.println("One");
    }
}
class MyData3 extends MyData1{
    void display(){
        System.out.println("Two");
    }
}


public class Abstraction {

	public static void main(String[] args) {
	    //MyData1 md = new MyData2();
	    MyData1 md = new MyData3();
	    md.display();

	}

}
