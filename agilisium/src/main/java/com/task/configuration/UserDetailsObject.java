package com.task.configuration;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.task.dto.User;

public class UserDetailsObject implements UserDetails{

	
	private String username;
	private String password;
	private boolean isAccountNonExpired;
	private boolean isAccountNonLocked;
	private boolean isCredentialsNonExpired;
	private boolean isEnabled;
	private List<SimpleGrantedAuthority> roles;
	
	public UserDetailsObject(User user) {
		this.username = user.getUserName();
		this.password = user.getPassword();
		this.isAccountNonExpired = user.isAccountNonExpired();
		this.isAccountNonLocked = user.isAccountNonLocked();
		this.isCredentialsNonExpired = user.isCredentialsNonExpired();
		this.isEnabled = user.isEnabled();
		this.roles = user.getRoles();
	}
	
	public UserDetailsObject(){
		
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return roles;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return isAccountNonExpired;
	}

	@Override
	public boolean isAccountNonLocked() {
		return isAccountNonLocked;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return isCredentialsNonExpired;
	}

	@Override
	public boolean isEnabled() {
		return isEnabled;
	}
}