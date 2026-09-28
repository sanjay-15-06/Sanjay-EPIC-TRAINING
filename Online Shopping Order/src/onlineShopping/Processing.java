package onlineShopping;

public class Processing extends Thread {
	Order order;

    Processing(Order order) {
        this.order = order;
    }

    public void run() {
    	order.updateStatus("Order Placed");
        order.updateStatus("Payment Processing");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        order.updateStatus("Payment Completed");
        order.updateStatus("Order is Being Shipped");
        
    }

}
