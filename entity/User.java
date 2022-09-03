package net.javaguides.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admin_Table")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int devId;
	private String query;
	private int feedId;
	private int respId;
	private String answer;
	private boolean status;
	private boolean statusFeed;
	private boolean statusResp;

	public boolean isStatusFeed() {
		return statusFeed;
	}
	public void setStatusFeed(boolean statusFeed) {
		this.statusFeed = statusFeed;
	}
	public boolean isStatusResp() {
		return statusResp;
	}
	public void setStatusResp(boolean statusResp) {
		this.statusResp = statusResp;
	}
	public User(int devId, String query, int feedId, int respId, String answer, boolean status, boolean statusFeed,
			boolean statusResp) {
		super();
		this.devId = devId;
		this.query = query;
		this.feedId = feedId;
		this.respId = respId;
		this.answer = answer;
		this.status = status;
		this.statusFeed = statusFeed;
		this.statusResp = statusResp;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public User() {
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
