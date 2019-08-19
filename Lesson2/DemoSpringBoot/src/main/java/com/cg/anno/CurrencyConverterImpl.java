package com.cg.anno;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("currencyConverter")
public class CurrencyConverterImpl implements CurrencyConverter {
	
	
	// currencyConverterImpl 
	
	@PostConstruct
	void init(){
		System.out.println("in init() - called thru @PostConstruct");
	}
	
	@PreDestroy
	void destroy(){
		System.out.println("in destroy() - called thru @PreDestroy");
	}
	
	public CurrencyConverterImpl() {
		System.out.println("CurrencyConverterImpl()");
	}
	@Autowired
	public CurrencyConverterImpl(ExchangeServiceImpl exchangeService) {
		System.out.println("CurrencyConverterImpl()");
		this.exchangeService = exchangeService;
	}
	
	@Autowired
	private ExchangeServiceImpl exchangeService;

	/*public ExchangeServiceImpl getExchangeService() {
		System.out.println("getExchangeService()");		
		return exchangeService;
	}

	@Autowired
	public void setExchangeService(ExchangeServiceImpl exchangeService) {
		System.out.println("setExchangeService()");		
		this.exchangeService = exchangeService;
	}*/

	public double dollarsToRupees(double dollars) {
		System.out.println("dollarsToRupees()");		
		return dollars * exchangeService.getExchangeRate();
	}
};