package net.javaguides.springboot.service;

import org.springframework.http.ResponseEntity;

import net.javaguides.springboot.Dto.AdminDto;
import net.javaguides.springboot.entity.Admin;

public interface AdminService {

	public ResponseEntity<Admin> blockUser(AdminDto adminDto, int devId);

	public ResponseEntity<Admin> blockFeed(AdminDto adminDto, int feedId);

	public ResponseEntity<Admin> blockResp(AdminDto adminDto, int respId);

	public ResponseEntity<Admin> unblockFeed(AdminDto adminDto, int feedId);

	public ResponseEntity<Admin> unblockUser(AdminDto adminDto, int devId);

	public ResponseEntity<Admin> unblockResp(AdminDto adminDto, int respId);

	


	

	

}
