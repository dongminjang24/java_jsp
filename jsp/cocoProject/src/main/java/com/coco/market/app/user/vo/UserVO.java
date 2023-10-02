package com.coco.market.app.user.vo;

public class UserVO {
//	 user_number int unsigned auto_increment primary key,
//	 user_email varchar(255),
//	 user_password varchar(255),
//	 user_nickname varchar(255),
//	 user_address varchar(255),
//	 user_phone_number varchar(255)
	
	
	private String userEmail;
	private String userPassword;
	private String userNickname;
	private String userAddress;
	private String UserPhoneNumber;
	
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserNickname() {
		return userNickname;
	}
	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserPhoneNumber() {
		return UserPhoneNumber;
	}
	public void setUserPhoneNumber(String userPhoneNumber) {
		UserPhoneNumber = userPhoneNumber;
	}
	@Override
	public String toString() {
		return "UserVO [userEmail=" + userEmail + ", userPassword=" + userPassword + ", userNickname=" + userNickname
				+ ", userAddress=" + userAddress + ", UserPhoneNumber=" + UserPhoneNumber + "]";
	}
	
	
}
