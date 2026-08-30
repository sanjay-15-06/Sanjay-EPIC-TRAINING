package oops;


class MyData{
    void display(int a){
        System.out.println("One");
    }
    void display(int a,int b){
        System.out.println("Two");
    }
    void display(int a,int b,int c){
        System.out.println("Three");
    }

}

public class MethodOverLoading {

	public static void main(String[] args) {
		MyData obj = new MyData();
		obj.display(10);//pass the arguments to  the 1st display() because it checks for the parameter and match the method
		obj.display(10,20);//pass the arguments to  the 2nd display() because it checks for the parameter and match the method
		obj.display(10,23,22);//pass the arguments to  the 3rd display() because it checks for the parameter and match the method
	}

}

