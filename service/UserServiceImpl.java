package com.springboot.springbootdevapp.adminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.springbootdevapp.adminEntity.Admin;
import com.springboot.springbootdevapp.adminRepository.AdminRepo;

@Service
public class UserServiceImpl implements AdminService{

	@Autowired
	AdminRepo adminRepo;
	
	

	

	@Override
	public String blockUser(Admin admin) {
		admin.setStatus(false);
		return "user gone lol";
		
		
	}





	@Override
	public String unBlock(Admin admin) {
		admin.setStatus(true);
		return "User enjoy";
	}
	





	@Override
	public String deleteFeed(Admin admin) {
		adminRepo.deleteAll();
		return null;
	}


}
