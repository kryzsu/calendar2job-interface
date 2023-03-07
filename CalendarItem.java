package csomag;

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
	public void setDatum(LocalDate datum) {
		this.datum = datum;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public boolean isOccupied() {
		return occupied;
	}
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getDayOfWeek() {
		return dayOfWeek;
	}
	public void setDayOfWeek(int dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
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
