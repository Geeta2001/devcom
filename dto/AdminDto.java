package net.javaguides.springboot.adminDto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class AdminDto {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int devId;
	private String query;
	private int feedId;
	private int respId;
	private String answer;
	public AdminDto(int devId, String query, int feedId, int respId, String answer) {
		super();
		this.devId = devId;
		this.query = query;
		this.feedId = feedId;
		this.respId = respId;
		this.answer = answer;
	}
	public AdminDto() {
		super();
	}
	public int getDevId() {
		return devId;
	}
	public void setDevId(int devId) {
		this.devId = devId;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public int getFeedId() {
		return feedId;
	}
	public void setFeedId(int feedId) {
		this.feedId = feedId;
	}
	public int getRespId() {
		return respId;
	}
	public void setRespId(int respId) {
		this.respId = respId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	

}
