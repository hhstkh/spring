package com.springtutorial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_account")
public class UserAccount {
	
	@Id
	@Column
	private int id;
	
	private String username;
	
	private String password;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id", foreignKey = @ForeignKey(name = "FK_USR_ACC_USR_ROLE"))
	private UserRole userRole;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

}
