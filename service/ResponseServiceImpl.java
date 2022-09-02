package com.devcom.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devcom.dto.ResponseDto;
import com.devcom.entity.Response;
import com.devcom.repository.IResponseRepository;

@Service
public class ResponseServiceImpl implements IResponseService {
	
	@Autowired
	IResponseRepository respRepo;

	@Override
	public Response addResponse(ResponseDto responseDto) {
		
		Response response= new Response();		
		response.setAnswer(responseDto.getAnswer());
		response.setRespDate_time(responseDto.getRespDate_time());	
		return respRepo.save(response);
	}

	@SuppressWarnings("deprecation")
	@Override
	public ResponseEntity<Response> editResponse(int respId, ResponseDto responseDto) {
		
		Response getResp=respRepo.getById(respId);
		getResp.setAnswer(responseDto.getAnswer());
		
		Response updateResp= respRepo.save(getResp);
		
		return ResponseEntity.ok().body(updateResp);
	
	}

	@Override
	public String removeResponse(int respId) {
		
		Optional<Response> resp =respRepo.findById(respId);
		if(!resp.isPresent()) {
			System.out.println("Response Not Found");
		}
		respRepo.deleteById(respId);
		return "Response Deleted";
	
	}
}
