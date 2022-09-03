package net.javaguides.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.Dto.AdminDto;
import net.javaguides.springboot.entity.Admin;
import net.javaguides.springboot.service.AdminService;

@RestController
@RequestMapping("/devapp-admin")
public class AdminController {
	
	
	@Autowired
	AdminService iUserService;
	
	@PutMapping("/BlockFeed/{feedId}")
	public ResponseEntity<Admin> blockFeed(@PathVariable("feedId") int feedId,@RequestBody AdminDto adminDto){
		return this.iUserService.blockFeed(adminDto,feedId);
	}
	
	@PutMapping("/UnblockFeed/{feedId}")
	public ResponseEntity<Admin> unblockFeed(@PathVariable("feedId") int feedId,@RequestBody AdminDto adminDto){
		return this.iUserService.unblockFeed(adminDto,feedId);
	}
	
	@PutMapping("/BlockUser/{devId}")
	public ResponseEntity<Admin> blockUser(@PathVariable("devId") int devId,@RequestBody AdminDto adminDto){
		return this.iUserService.blockUser(adminDto,devId);
	}
	
	@PutMapping("/UnBlockUser/{devId}")
	public ResponseEntity<Admin> unblockUser(@PathVariable("devId") int devId,@RequestBody AdminDto adminDto){
		return this.iUserService.unblockUser(adminDto,devId);
	}
	
	
	@PutMapping("/BlockResp/{respId}")
	public ResponseEntity<Admin> blockResp(@PathVariable("respId") int respId,@RequestBody AdminDto adminDto){
		return this.iUserService.blockResp(adminDto,respId);
	}
	
	@PutMapping("/UnBlockResp/{respId}")
	public ResponseEntity<Admin> unblockResp(@PathVariable("respId") int respId,@RequestBody AdminDto adminDto){
		return this.iUserService.unblockResp(adminDto,respId);
	}

	
	
	
	
	
	
	
	

	
	
}
