package com.Moviedetails.app.ModelM;

import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
@Entity
public class QuestionM {

	@Id
	private int qNo;
	private String qName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List<AnswerM> ans;
	
	public int getqNo() {
		return qNo;
	}
	public void setqNo(int qNo) {
		this.qNo = qNo;
	}
	public String getqName() {
		return qName;
	}
	public void setqName(String qName) {
		this.qName = qName;
	}
	public List<AnswerM> getAns() {
		return ans;
	}
	public void setAns(List<AnswerM> ans) {
		this.ans = ans;
	}
}
