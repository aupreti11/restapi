package com.creditcardapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.creditcardapi.dto.CreditCardDTO;
import com.creditcardapi.dto.CreditCardVO;
import com.creditcardapi.service.CreditCardService;

@RestController
public class CreditCardController {
	
	@Autowired
	private CreditCardService creditCardService;
	
	@GetMapping("/creditcard/{cccid}") // getting data from the URI
	@ResponseStatus(code=HttpStatus.CREATED)
	public CreditCardDTO find(@PathVariable("cccid") int cid ) {
		return creditCardService.findDataById(cid);	
	}
	
	@GetMapping("/creditcards") // getting all the data
	@ResponseStatus(code=HttpStatus.CREATED)
	public List<CreditCardDTO> findAll(@PathVariable("cccid") int cid ) {
		List<CreditCardDTO> cardDTOs= creditCardService.findAllData();
		return cardDTOs;
	}
	
	@PostMapping("/creditcards")
	@ResponseStatus(code=HttpStatus.OK)
	public CreditCardDTO createData(@RequestBody CreditCardDTO creditCardDTO) {
		int pkey = creditCardService.saveData(creditCardDTO);
		creditCardDTO.setMid(pkey);
		CreditCardVO cardVO= new CreditCardVO();
		cardVO.setCode("200");
		cardVO.setMsg("Your data is uploaded successfully");
		return creditCardDTO;
		
	}
	
	@DeleteMapping("creditcards/{cid}")
	@ResponseStatus(code=HttpStatus.OK)
	public CreditCardVO deleteData(@PathVariable("cid") int cid) {
		creditCardService.deleteDataById(cid);
		CreditCardVO cardVO = new CreditCardVO();
		cardVO.setCode("20000");
		cardVO.setMsg("your card details has been deleted");
		return cardVO;
	}
	
	@PutMapping("/creditcards/{cid}")
	@ResponseStatus(code=HttpStatus.OK)
	public CreditCardDTO updateData(@PathVariable("cid") CreditCardDTO creditCardDTO) {
		creditCardService.saveData(creditCardDTO);
		CreditCardVO cardVO = new CreditCardVO();
		cardVO.setMsg("Your data is updated successfully");
		return creditCardDTO;
		
	}

}
