package com.devcom.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Date;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.devcom.dto.FeedDto;
import com.devcom.entity.Developer;
import com.devcom.entity.Feed;
import com.devcom.repository.IFeedRepository;
@RunWith(SpringRunner.class)
@SpringBootTest
class FeedServiceImpTest {
	
	@Autowired
	private FeedServiceImp feedService;
	
	@Mock
	private IFeedRepository feedRepository;

	@Test              
	void testAddFeed() {
		Feed feed = new Feed(1,"asking question",new Date(),"Java",4);
		
		when(feedRepository.save(feed)).thenReturn(feed);
		assertEquals(feed,feedRepository.save(feed));
		
	}
	
//	@Test
//	void testAddFeedN() {
//		
//		
//	}

//	@SuppressWarnings("deprecation")
//	@Test
//	void testEditFeed() {
//		Feed feed = new Feed(1,"asking question",new Date(),"Java",4);
//		ResponseEntity<Feed> feedEntity= ResponseEntity.ok(feed);
//		FeedDto feedDto = new FeedDto();
//		BeanUtils.copyProperties(feed, feedDto); 
//		when(feedRepository.getById(1)).thenReturn(feed);
//		
//		assertEquals(feedEntity,feedService.editFeed(1, feedDto));
//	}

//	@Test
//	void testRemoveFeed() {
//		assertEquals("Feed Deleted",feedService.removeFeed(1));
//	}
//	@Test
//	void testGetDeveloper() {
//		Developer developer= new Developer(1,"name","name","name",6,6,true,false);
//		Optional<Developer> devOptional = Optional.of(developer);
//		when(developerRepository.findById(1)).thenReturn(devOptional);
//    assertEquals(1,developerServiceImpl.getAllDevelopers().size());
//	}

	@Test
	void testGetFeed() {
		Feed feed = new Feed(1,"asking question",new Date(),"Java",4);
		Optional<Feed> feedOptional = Optional.of(feed);
		when(feedRepository.findById(1)).thenReturn(feedOptional);
		assertEquals(feedOptional,feedService.getFeed(1));
		
	}

}
