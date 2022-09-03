package net.javaguides.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.Dto.AdminDto;
import net.javaguides.springboot.entity.Admin;
import net.javaguides.springboot.repository.IAdminRepository;

@Service("IUserService")
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	IAdminRepository iUserRepository;

	
	@SuppressWarnings("deprecation")
	@Override
	public ResponseEntity<Admin> blockUser(AdminDto adminDto, int devId) {
		
		Admin getDev =iUserRepository.getById(devId);
		getDev.setStatus(false);
		Admin updateDev =iUserRepository.save(getDev);
		return ResponseEntity.ok().body(updateDev);
	}

	@SuppressWarnings("deprecation")
	@Override
	public ResponseEntity<Admin> blockFeed(AdminDto adminDto, int feedId) {
		Admin getDev=iUserRepository.getById(feedId);
		getDev.setStatusFeed(false);
		Admin updateDev =iUserRepository.save(getDev);
		
		return ResponseEntity.ok().body(updateDev);
	}
	
	
	
	@SuppressWarnings("deprecation")
	@Override
	public ResponseEntity<Admin> blockResp(AdminDto adminDto, int respId) {
		Admin getDev=iUserRepository.getById(respId);
		getDev.setStatusResp(false);
		Admin updateDev =iUserRepository.save(getDev);
		
		return ResponseEntity.ok().body(updateDev);
		
	}

	@Override
	public ResponseEntity<Admin> unblockFeed(AdminDto adminDto, int feedId) {
		@SuppressWarnings("deprecation")
		Admin getDev=iUserRepository.getById(feedId);
		getDev.setStatusFeed(true);
		Admin updateDev =iUserRepository.save(getDev);
		
		return ResponseEntity.ok().body(updateDev);
		
	}

	@Override
	public ResponseEntity<Admin> unblockUser(AdminDto adminDto, int devId) {
		
		@SuppressWarnings("deprecation")
		Admin getDev =iUserRepository.getById(devId);
		getDev.setStatus(true);
		Admin updateDev =iUserRepository.save(getDev);
		return ResponseEntity.ok().body(updateDev);
	}

	@Override
	public ResponseEntity<Admin> unblockResp(AdminDto adminDto, int respId) {
		@SuppressWarnings("deprecation")
		Admin getDev=iUserRepository.getById(respId);
		getDev.setStatusResp(true);
		Admin updateDev =iUserRepository.save(getDev);
		
		return ResponseEntity.ok().body(updateDev);
	}


	


	




	
	}


