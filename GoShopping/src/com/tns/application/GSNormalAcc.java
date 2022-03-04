package com.tns.application;
import com.tns.framework.*;

public class GSNormalAcc extends NormalAcc{


	public GSNormalAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
	}


	@Override
	public void bookProduct(float a) {
		super.bookProduct(a);
	}

	@Override
	public String toString() {
		return "GSNormalAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	};
}
