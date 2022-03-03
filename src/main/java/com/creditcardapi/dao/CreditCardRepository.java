package com.creditcardapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.creditcardapi.dto.CreditCardDTO;

public interface CreditCardRepository extends JpaRepository<CreditCardEntity, Integer>{

	void save(CreditCardDTO creditCardDTO);

}
