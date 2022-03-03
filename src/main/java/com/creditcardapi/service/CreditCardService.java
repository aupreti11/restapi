package com.creditcardapi.service;

import java.util.List;

import com.creditcardapi.dto.CreditCardDTO;

public interface CreditCardService {

	int saveData(CreditCardDTO creditCardDTO);

	CreditCardDTO findDataById(int cid);

	void deleteDataById(int cid);

	List<CreditCardDTO> findAllData();

}
