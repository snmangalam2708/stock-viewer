package com.sandeep.stock.dbservice.repository;

import com.sandeep.stock.dbservice.model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface QuotesRepository extends JpaRepository<Quote, Integer>{

    List<Quote> findByUserName(String username);

}
