package com.project.htproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.htproject.entity.Address;
import com.project.htproject.repository.AddressRepo;

@Service
public class AddressService implements IAddressService {

	@Autowired
	  private AddressRepo repository;
	
		@Override
		public List<Address>getAllAddress() {
			List<Address> allAddress = repository.findAll();
			return allAddress;
		}
		
		
	//	public String addAddress(AddressDto addressDto, Long candidateId) {
//			   
//		       Candidate candidate = new Candidate();
//			   Long candidateId1 = candidate.getCandidateID();
//		       String addressLine1 = addressDto.getAddressLine1();
//		       String addressLine2 = addressDto.getAddressLine2();
//		       Integer district = addressDto.getDistrict();
//		       Integer state = addressDto.getState();
//			   Integer countryId = addressDto.getCountryId();
//			   String pincode = addressDto.getPincode();
//			   Address address = new Address(addressLine1, addressLine2, district, state, countryId, pincode,);
//			   //repository.saveOrUpdate(gotcandidateId,addressLine1,addressLine2,district ,state, countryId,  pincode);
//			    return "Succesfully insert";
//		}
}
