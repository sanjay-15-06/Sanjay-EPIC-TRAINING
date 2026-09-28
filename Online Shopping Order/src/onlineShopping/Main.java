package onlineShopping;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Order o = new Order();
		Processing p = new Processing(o);
		OrderDelivery od = new OrderDelivery(o);
		o.start();
		p.start();
		p.join();
		od.start();
		
		
	}

}
