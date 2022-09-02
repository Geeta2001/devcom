package com.devcom.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devcom.dto.UserDto;
import com.devcom.entity.User;
import com.devcom.repository.UserRepo;

@Service
public class UserServiceImpl implements UserIService {
	@Autowired
	UserRepo userRepo;
	
//	public UserServiceImpl(UserRepo userRepo) {
//		super();
//		this.userRepo = userRepo;
//	}
	

	@Override
	public User registerUser(UserDto userdto) {
//		UserDto user = new UserDto(userdto.getUsername(), userdto.getPassword(), userdto.getRole());
		User user = new User();
		
		
//		Optional<UserDto> opt1 = userdto.getUsername();
		user.setUserName(userdto.getUserName());
		user.setPassword(userdto.getPassword());
		user.setRole(userdto.getRole());
		
		return userRepo.save(user);
		
	}
	
//	public User validateUser(String username,String password)throws Exception {
//		User bean=null;
//		try {
//		for(User i:iUserRepository.findAll()) {
//			if(i.getUserName().equals(username)) {
//				if(i.getPassword().equals(password)) {
//					if(i.getStatus()==true) {
//					bean=i;
//					return bean;
//					}
//				}
//				return bean;
//			}
//		}
//		}
//		catch(Exception e) {
//			throw new Exception("User details not found!");
//		}
//		return bean;
	

}
