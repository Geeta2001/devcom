package net.javaguides.springboot.service;

import org.springframework.http.ResponseEntity;

import net.javaguides.springboot.adminDto.AdminDto;
import net.javaguides.springboot.entity.User;

public interface IUserService {

	public ResponseEntity<User> blockUser(AdminDto adminDto, int devId);

	public ResponseEntity<User> blockFeed(AdminDto adminDto, int feedId);

	public ResponseEntity<User> blockResp(AdminDto adminDto, int respId);

	public ResponseEntity<User> unblockFeed(AdminDto adminDto, int feedId);

	public ResponseEntity<User> unblockUser(AdminDto adminDto, int devId);

	public ResponseEntity<User> unblockResp(AdminDto adminDto, int respId);

	


	

	

}
