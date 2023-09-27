package com.xworkz.vrihiagro.dto;

public class VrihiAgroDto {
	
	private String name;
	private String email;
	private String confirmEmail;
	private String password;
	private String confirmPassword;
	private String address;
	private String address2;
	private String city;
	private String region;
	private String postalCode;
	private String phoneNumber;
	private String aboutMe;
	
	

	public VrihiAgroDto() {
		System.out.println("Inside Dto");
	}
	public VrihiAgroDto(String name, String email, String confirmEmail, String password, String confirmPassword,
			String address, String address2, String city, String region, String postalCode, String phoneNumber,
			String aboutMe) {
		super();
		this.name = name;
		this.email = email;
		this.confirmEmail = confirmEmail;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.address = address;
		this.address2 = address2;
		this.city = city;
		this.region = region;
		this.postalCode = postalCode;
		this.phoneNumber = phoneNumber;
		this.aboutMe = aboutMe;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getConfirmEmail() {
		return confirmEmail;
	}
	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAboutMe() {
		return aboutMe;
	}
	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}
	@Override
	public String toString() {
		return "VrihiAgroDto [name=" + name + ", email=" + email + ", confirmEmail=" + confirmEmail + ", password="
				+ password + ", confirmPassword=" + confirmPassword + ", address=" + address + ", address2=" + address2
				+ ", city=" + city + ", region=" + region + ", postalCode=" + postalCode + ", phoneNumber="
				+ phoneNumber + ", aboutMe=" + aboutMe + "]";
	}
	
	
}
