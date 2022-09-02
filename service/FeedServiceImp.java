package com.devcom.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devcom.dto.FeedDto;
import com.devcom.entity.Feed;
import com.devcom.repository.IFeedRepository;


@Service
public class FeedServiceImp implements IFeedService{
	@Autowired
	IFeedRepository feedRepository;
	/*
	public void deleteFeed(Integer feedid) {
		feedRepository.deleteById(feedid);
	}*/

	@Override
	public Feed addFeed(FeedDto feed) {
		Feed feed1=new Feed();
		feed1.setQuery(feed.getQuery());
		feed1.setTopic(feed.getTopic());
		// TODO Auto-generated method stub
		return  feedRepository.save(feed1);
		
	}
	@SuppressWarnings("deprecation")
	@Override
	public ResponseEntity<Feed> editFeed(int feedid, FeedDto feed) {
		
		Feed getFeed=feedRepository.getById(feedid);
		getFeed.setQuery(feed.getQuery());
		
		Feed updateFeed= feedRepository.save(getFeed);
		return ResponseEntity.ok().body(updateFeed);
	
	}
	@Override
	public String removeFeed(int feedid) {
		
		Optional<Feed> feed =feedRepository.findById(feedid);
		if(!feed.isPresent()) {
			System.out.println("Response Not Found");
		}
		feedRepository.deleteById(feedid);
        return "Feed Deleted";
	
	}
	@Override
	public Optional<Feed> getFeed(int feedid) {
		// TODO Auto-generated method stub
		return feedRepository.findById(feedid);
	}
}



