package com.creditcardapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.creditcardapi.dao.CreditCardEntity;
import com.creditcardapi.dao.CreditCardRepository;
import com.creditcardapi.dto.CreditCardDTO;

@Service
public class CreditCardServiceImpl implements CreditCardService {
	
	@Autowired
	private CreditCardRepository creditCardRepository;

	@Override
	public int saveData(CreditCardDTO creditCardDTO) {
		CreditCardEntity cardEntity = new CreditCardEntity();
		BeanUtils.copyProperties(creditCardDTO, cardEntity);
		CreditCardEntity entity= creditCardRepository.save(cardEntity);
		return entity.getCid();
		
	}

	@Override
	public CreditCardDTO findDataById(int cid) {
		CreditCardEntity cardEntity = creditCardRepository.findById(cid).get();
		CreditCardDTO cardDTO = new CreditCardDTO();
		BeanUtils.copyProperties(cardEntity, cardDTO);
		return cardDTO;	
	}
	
	@Override
	public void deleteDataById(int cid) {
		creditCardRepository.deleteById(cid);
	}
	
	@Override
	public List<CreditCardDTO> findAllData(){
		List<CreditCardDTO> cardDTOs = new ArrayList<CreditCardDTO>();
		List<CreditCardEntity> cardEntity = creditCardRepository.findAll();
		for(CreditCardEntity cards: cardEntity) {
			CreditCardDTO cardDTO = new CreditCardDTO();
			BeanUtils.copyProperties(cards, cardDTO);
		}
		return cardDTOs;
		
	}
}
