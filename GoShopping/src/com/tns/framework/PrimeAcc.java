package com.tns.framework;

public abstract class PrimeAcc extends ShopAcc{

	private boolean isPrime = true;
	float deliverycharge;
	private boolean getisPrime() {
		return this.isPrime;
	}
	
	private float getDeliverycharge() {
		return deliverycharge;
	}

	public PrimeAcc(int accNo, String accNm, float charges) {
		super(accNo, accNm, charges);
	}
	
	@Override
	public void bookProduct(float a) {
		System.out.println("Your order is Placed");
	}
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", deliverycharge=" + deliverycharge + "]";
	}
	
}
