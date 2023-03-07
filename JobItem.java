package csomag;

import java.time.LocalDate;

public class JobItem {
	
	private String id;
	private String name;
	private LocalDate start;
	private LocalDate end;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getStart() {
		return start;
	}
	public void setStart(LocalDate start) {
		this.start = start;
	}
	public LocalDate getEnd() {
		return end;
	}
	public void setEnd(LocalDate end) {
		this.end = end;
	}
	
	public JobItem(String id, String name, LocalDate start, LocalDate end) {
		super();
		this.id = id;
		this.name = name;
		this.start = start;
		this.end = end;
	}
	
}
