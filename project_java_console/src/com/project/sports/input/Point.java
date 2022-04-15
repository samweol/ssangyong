package com.project.sports.input;

public class Point {
	
	private int seq;
	private String id;
	private int changePoint;
	private String detail;
	
	public Point(int seq, String id, int changePoint, String detail) {
		this.seq = seq;
		this.id = id;
		this.changePoint = changePoint;
		this.detail = detail;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getChangePoint() {
		return changePoint;
	}

	public void setChangePoint(int changePoint) {
		this.changePoint = changePoint;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	

}
