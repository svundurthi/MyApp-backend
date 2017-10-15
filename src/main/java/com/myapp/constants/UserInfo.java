package com.myapp.constants;

public class UserInfo {

	
	private String userKey;
	private String username;
	private String role;
	private String email;
	private String phone;
	public String getUserKey() {
		return userKey;
	}
	public void setUserKey(String userKey) {
		this.userKey = userKey;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "UserInfo [userKey=" + userKey + ", username=" + username + ", role=" + role + ", email=" + email
				+ ", phone=" + phone + "]";
	}
	
}
