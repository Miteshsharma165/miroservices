package com.main.springboot.currencyconversio;

import java.math.BigDecimal;

public class CurrencyConversion {

	private Long id;
	private String from;
	private String to;
	private BigDecimal quantity;
	private BigDecimal conversionMultiple;
	private BigDecimal totalConversion;
	private String environment;

	public CurrencyConversion() {
		super();
	}

	public CurrencyConversion(Long id, String from, String to,BigDecimal quantity, BigDecimal conversionMultiple ,
			BigDecimal totalConversion, String environment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.totalConversion = totalConversion;
		this.environment = environment;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotalConversion() {
		return totalConversion;
	}

	public void setTotalConversion(BigDecimal totalConversion) {
		this.totalConversion = totalConversion;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	
}
