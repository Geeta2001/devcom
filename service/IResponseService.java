package com.devcom.service;

import org.springframework.http.ResponseEntity;

import com.devcom.dto.ResponseDto;
import com.devcom.entity.Response;


public interface IResponseService {
	
	
	
	public Response addResponse(ResponseDto responseDto);

	public ResponseEntity<Response> editResponse(int respId, ResponseDto responseDto);
	
	public String removeResponse(int respId);
	
	
	
//	public Response likeResponse(int respId);
//	
//	public List<Response> getResponseByFeed(int feedId) throws UnknownFeedException;
//	
//	public List<Response> getResponseByDeveloper(int devId) throws UnknownDeveloperException;
	

}
