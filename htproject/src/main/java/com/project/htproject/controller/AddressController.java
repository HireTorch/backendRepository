package com.project.htproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.htproject.dto.Address;
import com.project.htproject.service.AddressService;

@RestController
@RequestMapping("/home/candidate/address")
public class AddressController {

	@Autowired
	private AddressService addressService;
	
	@GetMapping("/Address-All")
	public List<Address> getAllcandidate()
	{
		List<Address> allAddress = addressService.getAllAddress();
		return allAddress;
	}
//	@PostMapping("/save")
//	private SaveResponse saveAddresss(@RequestBody Address address)
//	{    
//		SaveResponse response = addressService.addAddress(address);
//		return response;
//	}
	//--------------------------------------------------------------------------------
	
//	@PostMapping("/save/{candidate_Id}")
//	public String saveAddress(@RequestBody AddressDto addressDto , @PathVariable("candidate_Id") Long candidateId)  {
//		String id = addressService.addAddress(addressDto , candidateId );
//		return id;
//	}

}
