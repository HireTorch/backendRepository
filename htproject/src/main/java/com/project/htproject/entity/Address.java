package com.project.htproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "candidate_address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "AddressId")
	private Long addressId;
	@Column(name = "line1")
	private String addressLine1;
	@Column(name = "line2")
	private String addressLine2;
	@Column(name = "districtId")
	private Integer district;
	@Column(name = "StateId")
	private Integer state;
	@Column(name = "countryId")
	private Integer countryId;
	@Column(name = "pincode")
	private String pincode;
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public Integer getDistrict() {
		return district;
	}
	public void setDistrict(Integer district) {
		this.district = district;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Integer getCountryId() {
		return countryId;
	}
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public Address(Long addressId, String addressLine1, String addressLine2, Integer district, Integer state,
			Integer countryId, String pincode) {
		super();
		this.addressId = addressId;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.district = district;
		this.state = state;
		this.countryId = countryId;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2
				+ ", district=" + district + ", state=" + state + ", countryId=" + countryId + ", pincode=" + pincode
				+ "]";
	}
	public Address(String addressLine1, String addressLine2, Integer district, Integer state, Integer countryId,
			String pincode) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.district = district;
		this.state = state;
		this.countryId = countryId;
		this.pincode = pincode;
	}
	
	
	

}
