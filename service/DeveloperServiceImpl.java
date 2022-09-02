package com.devcom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.devcom.dto.DeveloperDTO;
import com.devcom.entity.Developer;
import com.devcom.repository.DeveloperRepository;



@Service 
public class DeveloperServiceImpl implements DeveloperService {
	
	@Autowired
	DeveloperRepository developerRepository; 
	
	@Override
	public Developer addDeveloper(DeveloperDTO devDTO) {
		// TODO Auto-generated method stub
		Developer developer = new Developer();
		developer.setName(devDTO.getName());
		developer.setEmail(devDTO.getEmail());
		developer.setSkillLevel(devDTO.getSkillLevel());
		developer.setMemberSince(devDTO.getMemberSince());
		return developerRepository.save(developer);
	}

	@Override
	public Optional<Developer> getDeveloper(int devId) {
		// TODO Auto-generated method stub
		return developerRepository.findById(devId);
	}

	@Override
	public List<Developer> getAllDevelopers() {
		// TODO Auto-generated method stub
		return developerRepository.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public ResponseEntity<Developer> editDeveloper(DeveloperDTO developerdto, int devId) {
		// TODO Auto-generated method stub
		Developer getDev = developerRepository.getById(devId);
		getDev.setSkillLevel(developerdto.getSkillLevel());
		getDev.setName(developerdto.getName());
		
		Developer updateDev = developerRepository.save(getDev);
		
		return ResponseEntity.ok().body(updateDev);
	}



}
