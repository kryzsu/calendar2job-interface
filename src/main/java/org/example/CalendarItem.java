package org.example;

import java.time.LocalDate;

public class CalendarItem {

	private LocalDate datum;
	private String jobId;
	private boolean occupied;
	private String comment;
	private int dayOfWeek;
	
	public LocalDate getDatum() {
		return datum;
	}
	public String getJobId() {
		return jobId;
	}
	public String getComment() {
		return comment;
	}
	public CalendarItem(LocalDate datum, String jobId, boolean occupied, String comment, int dayOfWeek) {
		super();
		this.datum = datum;
		this.jobId = jobId;
		this.occupied = occupied;
		this.comment = comment;
		this.dayOfWeek = dayOfWeek;
	}
	

}
