package onlineShopping;

public class OrderDelivery extends Thread{
	
	 Order order;


	OrderDelivery(Order order) {
        this.order = order;
    }
	

	public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        order.updateStatus("Order delivered");
        order.updateStatus("Thank you for Shipping....!");
        
    }
}