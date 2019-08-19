package com.cg.intro;
public class CurrencyConverterImpl implements CurrencyConverter {
	
	
	private double exchangeRate;
	
	
	public CurrencyConverterImpl(double exchangeRate) {
		System.out.println("CurrencyConverterImpl()");
		this.exchangeRate = exchangeRate;
	}
	public CurrencyConverterImpl(String exchangeRate) {
		System.out.println("CurrencyConverterImpl() "
				+ "string parameter ");
		this.exchangeRate = Double.parseDouble(exchangeRate);
	}

/*	public double getExchangeRate() {
		System.out.println("getExchangeRate()");		
		return exchangeRate;
	}

	public void setExchangeRate(double exchangeRate) {
		System.out.println("setExchangeRate()");		
		this.exchangeRate = exchangeRate;
	}
*/
	
	public double dollarsToRupees(double dollars) {
		System.out.println("dollarsToRupees()");		
		return dollars * exchangeRate;
	}
}