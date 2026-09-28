package onlineShopping;

public class Order extends Thread{

	
	synchronized void updateStatus(String status) {
        System.out.println(status);
    }
		
}


