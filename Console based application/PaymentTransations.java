package cba;

import java.util.Scanner;

abstract class Payment{
	int transdId;
	String cusrName;
	int amount;

	
	Payment(int transId,String cusName,int amount){
		this.transdId= transId;
		this.cusrName= cusName;
		this.amount= amount;
	}

	abstract boolean validatePay();
	abstract void processPay();
	abstract double calTransFee();
	abstract int cashback();
	abstract int finalAmount();
	
}

class CreditCarPay extends Payment  {
	String cardNo;
	double transfee;
	double cashBack;
	int total;


	CreditCarPay(int transId, String cusName, int amount,String i) {
		super(transId, cusName, amount);
		this.cardNo =i;
	}

	double calTransFee() {
		transfee = (amount * 2/100);
		System.out.println("Transaction Fee: "+ transfee);
		return transfee;
	}

	@Override
	boolean validatePay() {
		if(cardNo.length()==16) {
			return true;
		}else {
			System.out.println("invalid card No");
			return false;
		}
		
	}

	@Override
	void processPay() {
		if(validatePay()==true) {
			calTransFee();
			cashback();
			finalAmount();
			
			}	
	}

	@Override
	int cashback() {
		cashBack = amount * 5/100;
		System.out.println("Cash Back: " + cashBack);
		return (int) cashBack ;
		
		
	}

	@Override
	int finalAmount() {
		total = (int) (amount + transfee - cashBack);
		System.out.println("Final Amount: " + total );
		return  total;
		// TODO Auto-generated method stub
		
	}
	
}

class UpiPayment extends Payment{
	String upiId;
	int transfee;
	int cashBack;
	int total;

	UpiPayment(int transId, String cusName, int amount,String upiId) {
		super(transId, cusName, amount);
		this.upiId= upiId;
	}

	@Override
	boolean validatePay() {
		
		return true;
	}

	@Override
	void processPay() {
		if(validatePay()==true) {
			calTransFee();
			cashback();
			finalAmount();
		}
	
	}

	@Override
	double calTransFee() {
		transfee = (int) (amount * 0.5/100);
		System.out.println("Transfer Fee: "+ transfee);
		return transfee;
	}

	@Override
	int cashback() {
		cashBack = amount * 2/100;
		System.out.println("CashBack: "+ cashBack);
		return cashBack;
	}

	@Override
	int finalAmount() {
		total = amount + transfee - cashBack;
		System.out.println("Total amount: "+ total);
		return amount + transfee - cashBack ;
	}
	
}


class NetBankingPayent extends Payment{
	String accNo;
	int transfee;
	int cashBack;
	int total;

	NetBankingPayent(int transId, String cusName, int amount,String accNo) {
		super(transId, cusName, amount);
		this.accNo=accNo;
	}

	
	boolean validatePay() {
		if(accNo.length()==12) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	void processPay() {
		if(validatePay()==true) {
			calTransFee();
			cashback();
			finalAmount();
		}
		
	}

	@Override
	double calTransFee() {
		transfee = amount * 1/100;
		System.out.println("Transfer Fee: "+ transfee);
		return transfee;
	}

	@Override
	int cashback() {
		
		cashBack = amount * 1/100;
		System.out.println("CashBack: "+cashBack);
		return cashBack;
	}

	@Override
	int finalAmount() {
		total =amount + transfee - cashBack; 
		System.out.println("Total: "+ total);
		return total  ;
	}
	
}
public class PaymentTransations {

	public static void main(String[] args) {
		CreditCarPay ccp = new CreditCarPay(12, "sanjay", 2000, "1234567891234567");
		
		NetBankingPayent nbp = new NetBankingPayent(123, "mohith",2800, "123456789123");
		
		UpiPayment upp = new UpiPayment(234,"sandy", 1000,"sasaddadgge");
		while(true) {
			System.out.println(" 1.Credit Card Payment\n 2.UPI Payment\n 3.Net Banking Payment");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		switch (n) {
		case 1:
			System.out.println("------------------Credit Card Payment--------------------");
			ccp.processPay();
			System.out.println("---------------------------------------------------------");
			break;
			
		case 2:
			System.out.println("------------------UPI Payment--------------------");
			upp.processPay();
			System.out.println("---------------------------------------------------------");

			break;
		
		case 3:
			System.out.println("------------------Net Banking Payment--------------------");
			nbp.processPay();
			System.out.println("---------------------------------------------------------");

			break;
			

		}
		
		}

	}

}
