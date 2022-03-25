package com.main.springboot.curencycexchangeservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurencyExchangeController {

	@Autowired
	private CurrencyRepositry currencyRepositry;
		
	Logger logger =LoggerFactory.getLogger(CurencyExchangeController.class);
	  
	  @Autowired private Environment environment;
	 

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurencyExchange retriveExchangeValue(@PathVariable String from, @PathVariable String to) {
   
		logger.info("retrive excange value called with {} to {} ",from,to);
		CurencyExchange curencyExchange = currencyRepositry.findByFromAndTo(from, to);
          
		if (curencyExchange == null) {
			throw new RuntimeException("Unable to find data" + from + "to" + to);
		}
		curencyExchange.setEnvironment(environment.getProperty("server.port"));
		return curencyExchange;

	}

}
