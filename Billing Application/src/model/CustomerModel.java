package model;

public class CustomerModel{
	private String cusName;
	private int cusId;
	private String cusMailId;
	public CustomerModel(String cusName, String cusMailId,int cusId ) {
		this.cusName = cusName;
		this.cusId = cusId;
		this.cusMailId = cusMailId;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getCusMailId() {
		return cusMailId;
	}
	public void setCusMailId(String cusMailId) {
		this.cusMailId = cusMailId;
	}
	
	
}


