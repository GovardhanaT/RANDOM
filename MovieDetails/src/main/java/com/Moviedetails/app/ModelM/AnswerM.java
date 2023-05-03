package com.Moviedetails.app.ModelM;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
	public class AnswerM 
	{
		@Id
		private int aNo;
		private String answer;
		public int getaNo() {
			return aNo;
		}
		public void setaNo(int aNo) {
			this.aNo = aNo;
		}
		public String getAnswer() {
			return answer;
		}
		public void setAnswer(String answer) {
			this.answer = answer;
		}
		
		

	}



