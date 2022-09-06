package com.devcom.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.devcom.entity.Developer;
import com.devcom.repository.DeveloperRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
class DeveloperServiceImplTest {
	
	@Autowired
	private DeveloperServiceImpl developerServiceImpl;
	
	@Mock
	private DeveloperRepository developerRepository;
	
	
	
//	@BeforeAll
//	public static void setUp() {
//		Developer developer = new Developer(1,"name","name","name",6,6,true,false);
//		developer.setMemberSince(Date.from(ZonedDateTime.now().minusYears(2).toInstant()));
//	}

	@Test
	void testAddDeveloper() {
		Developer developer = new Developer(1,"name","name","name",6,6,true,false);
		developer.setMemberSince(Date.from(ZonedDateTime.now().minusYears(2).toInstant()));
		when(developerRepository.save(developer)).thenReturn(developer);
	assertEquals(developer,developerRepository.save(developer));
		
	}

	
	@Test
	void testGetDeveloper() {
		Developer developer= new Developer(1,"name","name","name",6,6,true,false);
		Optional<Developer> devOptional = Optional.of(developer);
		when(developerRepository.findById(1)).thenReturn(devOptional);
    assertEquals(1,developerServiceImpl.getAllDevelopers().size());
	}

	@Test
	void testGetAllDevelopers() {
		int i=developerServiceImpl.getAllDevelopers().size();
		when(developerRepository.findAll()).thenReturn(Stream.of(new Developer(1,"name","name","name",6,6,true,false),
				new Developer(2,"name1","name1","name1",6,6,true,false)).collect(Collectors.toList()));
		System.out.println("value of i is"+i);
		assertEquals(2,developerServiceImpl.getAllDevelopers().size());
		
	}
//
//	@Test
//	void testEditDeveloper() {
//		fail("Not yet implemented");
//	}

}
