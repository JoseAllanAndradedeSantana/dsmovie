package com.joseallan.dsmovie.dto;

public class ScoreDTO {
	//email, id do filme e valor da avaliação
	
	private Long moveid;
	private String email;
	private Double score;
	
	public ScoreDTO() {
	}

	public Long getMoveid() {
		return moveid;
	}

	public void setMoveid(Long moveid) {
		this.moveid = moveid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}
	
	
}
