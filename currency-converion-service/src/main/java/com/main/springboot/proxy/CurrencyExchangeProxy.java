package com.main.springboot.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.main.springboot.currencyconversio.CurrencyConversion;

@FeignClient(name="currency-exchange")//,url="loclhost:8000")
                   
public interface CurrencyExchangeProxy {
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")	             
	public CurrencyConversion retriveExchangeValue(
			@PathVariable String from,@PathVariable String to);

}
