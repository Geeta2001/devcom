package net.javaguides.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.adminDto.AdminDto;
import net.javaguides.springboot.entity.User;
import net.javaguides.springboot.repository.IUserRepository;

@Service("IUserService")
public class IUserServiceImpl implements IUserService{
	
	@Autowired
	IUserRepository iUserRepository;

	
	@SuppressWarnings("deprecation")
	@Override
	public ResponseEntity<User> blockUser(AdminDto adminDto, int devId) {
		
		User getDev =iUserRepository.getById(devId);
		getDev.setStatus(false);
		User updateDev =iUserRepository.save(getDev);
		return ResponseEntity.ok().body(updateDev);
	}

	@SuppressWarnings("deprecation")
	@Override
	public ResponseEntity<User> blockFeed(AdminDto adminDto, int feedId) {
		User getDev=iUserRepository.getById(feedId);
		getDev.setStatusFeed(false);
		User updateDev =iUserRepository.save(getDev);
		
		return ResponseEntity.ok().body(updateDev);
	}
	
	
	
	@SuppressWarnings("deprecation")
	@Override
	public ResponseEntity<User> blockResp(AdminDto adminDto, int respId) {
		User getDev=iUserRepository.getById(respId);
		getDev.setStatusResp(false);
		User updateDev =iUserRepository.save(getDev);
		
		return ResponseEntity.ok().body(updateDev);
		
	}

	@Override
	public ResponseEntity<User> unblockFeed(AdminDto adminDto, int feedId) {
		@SuppressWarnings("deprecation")
		User getDev=iUserRepository.getById(feedId);
		getDev.setStatusFeed(true);
		User updateDev =iUserRepository.save(getDev);
		
		return ResponseEntity.ok().body(updateDev);
		
	}

	@Override
	public ResponseEntity<User> unblockUser(AdminDto adminDto, int devId) {
		
		@SuppressWarnings("deprecation")
		User getDev =iUserRepository.getById(devId);
		getDev.setStatus(true);
		User updateDev =iUserRepository.save(getDev);
		return ResponseEntity.ok().body(updateDev);
	}

	@Override
	public ResponseEntity<User> unblockResp(AdminDto adminDto, int respId) {
		@SuppressWarnings("deprecation")
		User getDev=iUserRepository.getById(respId);
		getDev.setStatusResp(true);
		User updateDev =iUserRepository.save(getDev);
		
		return ResponseEntity.ok().body(updateDev);
	}


	


	




	
	}


