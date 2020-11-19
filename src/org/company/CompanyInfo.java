package org.company;

public class CompanyInfo {
	
	public void companyName() {
		System.out.println("Bala Highway Logistics");

	}
	
	public void companyId() {
		System.out.println("34235346324234");

	}
	
	public void companyAddress() {
		System.out.println("Chennai, Tamil Nadu, India");

	}
	
	public static void main(String[] args) {
		CompanyInfo c=new CompanyInfo();
		
		c.companyName();
		c.companyId();
		c.companyAddress();
	}

}
