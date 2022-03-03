package com.creditcardapi.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.BeanUtils;

import com.creditcardapi.dao.CreditCardEntity;
import com.creditcardapi.dao.CreditCardRepository;
import com.creditcardapi.dto.CreditCardDTO;

class CreditCardServiceImplTest {

	@Mock
	private CreditCardRepository creditCardRepository;
	
	@InjectMocks
	private CreditCardServiceImpl creditCardServiceImpl;
	
	@Before(value = "")
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testFindByIdWhenExist() {
		CreditCardEntity cardEntity = new CreditCardEntity();
		cardEntity.setCno("12344");
		cardEntity.setCvv(245);
		cardEntity.setName("VISA Type");
		cardEntity.setType("Credit card");
		when(creditCardRepository.findById(100))
		.thenReturn(Optional.of(cardEntity));
		
		CreditCardDTO creditCardDTO = creditCardServiceImpl.findDataById(100);
		assertNotNull(creditCardDTO);
		assertEquals("12344",creditCardDTO.getCno());
		assertEquals("245", creditCardDTO.getCvv());
		assertEquals("VISA Type", creditCardDTO.getName());
		assertEquals("Credit card",creditCardDTO.getType());	
	}
	
	@Test
	public void testFindByIdWhenNotExist() {
		
		when(creditCardRepository.findById(100))
		.thenReturn(Optional.empty());
		creditCardServiceImpl.findDataById(100);
	}

}
