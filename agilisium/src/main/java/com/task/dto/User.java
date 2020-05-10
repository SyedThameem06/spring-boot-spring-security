package com.task.dto;

import java.util.List;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

public class User {

	private String userName;
	private String password;
	private boolean isAccountNonExpired;
	private boolean isAccountNonLocked;
	private boolean isCredentialsNonExpired;
	private boolean isEnabled;
	private List<SimpleGrantedAuthority> roles;
	
	public String getUserName() {
		return userName;
	}
	public User setUserName(String userName) {
		this.userName = userName;
		return this;
	}
	public String getPassword() {
		return password;
	}
	public User setPassword(String password) {
		this.password = password;
		return this;
	}
	public boolean isAccountNonExpired() {
		return isAccountNonExpired;
	}
	public User setAccountNonExpired(boolean isAccountNonExpired) {
		this.isAccountNonExpired = isAccountNonExpired;
		return this;
	}
	public boolean isAccountNonLocked() {
		return isAccountNonLocked;
	}
	public User setAccountNonLocked(boolean isAccountNonLocked) {
		this.isAccountNonLocked = isAccountNonLocked;
		return this;
	}
	public boolean isCredentialsNonExpired() {
		return isCredentialsNonExpired;
	}
	public User setCredentialsNonExpired(boolean isCredentialsNonExpired) {
		this.isCredentialsNonExpired = isCredentialsNonExpired;
		return this;
	}
	public boolean isEnabled() {
		return isEnabled;
	}
	public User setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
		return this;
	}
	
	public List<SimpleGrantedAuthority> getRoles() {
		return roles;
	}
	
	public User setRoles(List<SimpleGrantedAuthority> roles) {
		this.roles = roles;
		return this;
	}
}
