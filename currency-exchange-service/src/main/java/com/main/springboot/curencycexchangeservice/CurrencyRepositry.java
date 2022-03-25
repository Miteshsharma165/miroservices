package com.main.springboot.curencycexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRepositry extends JpaRepository<CurencyExchange,Long>{
     CurencyExchange  findByFromAndTo(String from,String to);
}
