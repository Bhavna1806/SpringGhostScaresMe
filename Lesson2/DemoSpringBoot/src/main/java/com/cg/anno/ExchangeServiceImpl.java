package com.cg.anno;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("exchangeService")
public class ExchangeServiceImpl implements ExchangeService {
	
	@Value("44.25")
	private double exchangeRate;

	public ExchangeServiceImpl() {
		System.out.println("ExchangeServiceImpl()");
	}
	public double getExchangeRate() {
		System.out.println("getExchangeRate()");
		return exchangeRate;
	}
}
