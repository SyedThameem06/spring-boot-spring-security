package com.task.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.task.dto.User;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = null;
		if(username.equals("ADMIN")){
			List<SimpleGrantedAuthority> rolesList = new ArrayList<SimpleGrantedAuthority>();
			rolesList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
			user = new User()
					.setUserName("ADMIN")
					.setPassword("efgh-12ee-adbe-t12f")
					.setAccountNonExpired(true)
					.setAccountNonLocked(true)
					.setCredentialsNonExpired(true)
					.setEnabled(true)
					.setRoles(rolesList);
		}else if(username.equals("USER")){
			List<SimpleGrantedAuthority> rolesList = new ArrayList<SimpleGrantedAuthority>();
			rolesList.add(new SimpleGrantedAuthority("ROLE_USER"));
			user = new User()
					.setUserName("USER")
					.setPassword("gfgh-22ee-akbe-t12l")
					.setAccountNonExpired(true)
					.setAccountNonLocked(true)
					.setCredentialsNonExpired(true)
					.setEnabled(true)
					.setRoles(rolesList);
		}
		
		return new UserDetailsObject(user);
	}
}
