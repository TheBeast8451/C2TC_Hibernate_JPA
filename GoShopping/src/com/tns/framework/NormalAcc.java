package com.tns.framework;

public abstract class NormalAcc extends ShopAcc{
	boolean deliveryCharge;
	public final boolean getDeliveryCharge() {
		return deliveryCharge;
	}

	public NormalAcc(int accNo, String accNm, float charges, boolean b) {
		super(accNo, accNm, charges);
		this.deliveryCharge = b;
	}

	@Override
	public void bookProduct(float a) {
		System.out.println("Your order is Placed");
	}
	
	@Override
	public String toString() {
		return "NormalAcc [deliveryCharge=" + deliveryCharge + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	};
	
}
