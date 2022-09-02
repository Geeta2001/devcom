package com.springboot.springbootdevapp.adminController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.springbootdevapp.adminEntity.Admin;
import com.springboot.springbootdevapp.adminRepository.AdminRepo;
import com.springboot.springbootdevapp.adminService.AdminService;

@RestController
@RequestMapping("/Admin")
public class AdminController {
	
	@Autowired
	AdminService adminservice;
	
	@Autowired
	AdminRepo adminRepo;
	
	
	@PutMapping("/BlockUser/{userid}")
	public String blockUser(@RequestBody Admin admin) {
		
		return adminservice.blockUser(admin);
	}
	
	@PutMapping("/UnBlockUser")
	public String unblock(@RequestBody Admin admin) {
		return adminservice.unBlock(admin);
	}
	
	@DeleteMapping("/DeleteFeed")
	public String deleteFeed(@RequestBody Admin admin) {
		admin.setUserid(1);
		admin.setPassword("dwa");
		admin.setStatus(true);
		admin.setUsername("dwa");
		
		return adminservice.deleteFeed(admin);
	}
	

	

}
