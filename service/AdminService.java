package com.springboot.springbootdevapp.adminService;

import com.springboot.springbootdevapp.adminEntity.Admin;

public interface AdminService {
	public String blockUser(Admin admin);
	public String unBlock(Admin admin);
	public String deleteFeed(Admin admin);

}
