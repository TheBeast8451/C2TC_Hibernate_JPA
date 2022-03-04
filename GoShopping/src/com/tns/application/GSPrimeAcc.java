package com.tns.application;
import com.tns.framework.*;

public class GSPrimeAcc extends PrimeAcc{
	private static final float charges=0;
	
	public float getCharges() {
		return charges;
	}
	
	public GSPrimeAcc(int accNo, String accNm, float charges) {
		super(accNo, accNm, charges);
	}

	
	@Override
	public void bookProduct(float a) {
		super.bookProduct(a);
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
