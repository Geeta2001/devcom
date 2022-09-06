package com.devcom.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.time.ZonedDateTime;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.devcom.dto.ResponseDto;
import com.devcom.entity.Response;
import com.devcom.repository.IResponseRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class ResponseServiceImplTest {
	
	@Autowired 
	private ResponseServiceImpl responseService;
	
	@Mock
	private IResponseRepository responseRepository;
	
	@InjectMocks
	 static Response response = new Response();
	 static ResponseDto responseDto = new ResponseDto();
	 
	 @BeforeAll
	 public static void setUp() {
		 response.setRespId(6);
		 response.setAnswer("mockito reply");
		 
		 
		 responseDto.setRespId(6);
		 responseDto.setAnswer("mockito reply");
	 }

	@Test
	void testAddResponse() {
		Response response = new Response(5,"answering to question");
		response.setResponseDate(LocalDate.from(ZonedDateTime.now().minusYears(2).toInstant()));	
		when(responseRepository.save(response)).thenReturn(response);
		assertEquals(response,responseRepository.save(response));	
	}
	
	
//	@Test
//	void testAddResponse( ) {
//		System.out.println(response.getRespId());
//		Mockito.when(responseRepository.save(response)).thenReturn(response);
//		System.out.println("test" + response.getRespId());
//		assertEquals(response, responseService.addResponse(responseDto));
//	}

	
	
//	@SuppressWarnings("deprecation")
//	@Test
//	void testEditResponse() {
//		Response getResp=responseRepository.getById(9);
//		
//		
//	}

	@Test
	void testRemoveResponse() {
		
//		Response response = new Response(22,"answering to question");
//		responseService.removeResponse(22);
//		verify(responseService,times(1)).respRepo.deleteById(22);
		assertEquals("Response Deleted",responseService.removeResponse(10));
	
	}

}