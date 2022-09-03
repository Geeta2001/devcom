package net.javaguides.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.adminDto.AdminDto;
import net.javaguides.springboot.entity.User;
import net.javaguides.springboot.service.IUserService;

@RestController
@RequestMapping("/devapp-admin")
public class UserController {
	
	
	@Autowired
	IUserService iUserService;
	
	@PutMapping("/BlockFeed/{feedId}")
	public ResponseEntity<User> blockFeed(@PathVariable("feedId") int feedId,@RequestBody AdminDto adminDto){
		return this.iUserService.blockFeed(adminDto,feedId);
	}
	
	@PutMapping("/UnblockFeed/{feedId}")
	public ResponseEntity<User> unblockFeed(@PathVariable("feedId") int feedId,@RequestBody AdminDto adminDto){
		return this.iUserService.unblockFeed(adminDto,feedId);
	}
	
	@PutMapping("/BlockUser/{devId}")
	public ResponseEntity<User> blockUser(@PathVariable("devId") int devId,@RequestBody AdminDto adminDto){
		return this.iUserService.blockUser(adminDto,devId);
	}
	
	@PutMapping("/UnBlockUser/{devId}")
	public ResponseEntity<User> unblockUser(@PathVariable("devId") int devId,@RequestBody AdminDto adminDto){
		return this.iUserService.unblockUser(adminDto,devId);
	}
	
	
	@PutMapping("/BlockResp/{respId}")
	public ResponseEntity<User> blockResp(@PathVariable("respId") int respId,@RequestBody AdminDto adminDto){
		return this.iUserService.blockResp(adminDto,respId);
	}
	
	@PutMapping("/UnBlockResp/{respId}")
	public ResponseEntity<User> unblockResp(@PathVariable("respId") int respId,@RequestBody AdminDto adminDto){
		return this.iUserService.unblockResp(adminDto,respId);
	}

	
	
	
	
	
	
	
	

	
	
}
