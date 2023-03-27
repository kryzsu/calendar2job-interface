package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Methods {

	public static List<JobItem> conversion(List<CalendarItem> ci) {
		List<JobItem> jobs = new ArrayList<JobItem>();
		int size = 0;
		for (int i = 0; i < ci.size(); i++) {
			LocalDate d = null;
			JobItem j = null;
				if (i != ci.size()-1) {
					if (!(ci.get(i).getJobId().equalsIgnoreCase(ci.get(i+1).getJobId()))) {
						d = ci.get(i+1).getDatum().minusDays(1);
						if (i == ci.size()-1) {
							size = jobs.size();
							jobs.get(size - 1).setEnd(d);
						}
					}
				}
				if (!(ci.get(i).getJobId().equals(""))){
					j = new JobItem(ci.get(i).getJobId(), ci.get(i).getComment(), ci.get(i).getDatum(), d);
					jobs.add(j);
				}
				if(i == ci.size()-1)
					jobs.get(jobs.size()-1).setEnd(jobs.get(jobs.size()-1).getStart());
		}
		return jobs;
	}
}
