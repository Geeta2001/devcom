package com.devcom.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table
public class Response {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int respId;
	
	private String answer;
	
	@JsonFormat(pattern="yyyy-MM-dd  hh:mm:ss")
	private LocalDateTime respDate_time;
	
	
	
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
	public LocalDateTime getRespDate_time() {
		return respDate_time;
	}
	public void setRespDate_time(LocalDateTime respDate_time) {
		this.respDate_time = respDate_time;
	}
	
}
