package com.project.htproject.dto;

public class Address {

	private Long addressId;
	private Long candidateId;
	private String addressLine1;
	private String addressLine2;
	private Integer district;
	private Integer state;
	private Integer countryId;
	private String pincode;
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	public Long getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(Long candidateId) {
		this.candidateId = candidateId;
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
	public Address(Long addressId, Long candidateId, String addressLine1, String addressLine2, Integer district,
			Integer state, Integer countryId, String pincode) {
		super();
		this.addressId = addressId;
		this.candidateId = candidateId;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.district = district;
		this.state = state;
		this.countryId = countryId;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", candidateId=" + candidateId + ", addressLine1=" + addressLine1
				+ ", addressLine2=" + addressLine2 + ", district=" + district + ", state=" + state + ", countryId="
				+ countryId + ", pincode=" + pincode + "]";
	}
	public Address(Long candidateId, String addressLine1, String addressLine2, Integer district, Integer state,
			Integer countryId, String pincode) {
		super();
		this.candidateId = candidateId;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.district = district;
		this.state = state;
		this.countryId = countryId;
		this.pincode = pincode;
	}
	public Address() {
		super();
	}
	
	
}
