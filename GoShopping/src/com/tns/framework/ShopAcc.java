package com.tns.framework;

public abstract class ShopAcc {
	// Fields
	private int accNo;
	private String accNm;
	private float charges;
	
	public int getAccNo() {
		return accNo;
	}
	
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	
	public float getCharges() {
		return charges;
	}
	
	// Constructors
	public ShopAcc(int accNo, String accNm, float charges) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	
//	abstract bookProduct()
	public abstract void bookProduct(float a);

//	method to display items
	public void items(float x) {
		System.out.println(
				"1. Mobile - 10000 \n2. Laptop - 50000 \n3. watch - 2000 \n4. shirt - 800 \n5. T-shirt - 400\n");
	}
	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	};
	
}
