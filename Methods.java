package csomag;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Methods {

	/*
	 * private List<CalendarItem> Reader() {
	 * 
	 * List<CalendarItem> calendar; CalendarItem ci = new CalendarItem();
	 * 
	 * BufferedReader in;
	 * 
	 * try { in = new BufferedReader(new FileReader("adatok.csv")); String s =
	 * in.readLine(); while (s != null) {
	 * 
	 * String[] st = s.split("\t"); s = in.readLine();
	 * 
	 * } in.close(); } catch (IOException e) { System.out.println(("Reader: " +
	 * e.getMessage())); }
	 * 
	 * return calendar;
	 * 
	 * }
	 */

	public List<JobItem> conversion(List<CalendarItem> ci) {

		List<JobItem> jobs = new ArrayList<JobItem>();
		int size = 0;

		for (int i = 0; i < ci.size(); i++) {

			LocalDate d = null;
			JobItem j = null;

			if (!(ci.get(i).getJobId().equals(""))) {

				if (i != 0) {
					if (!(ci.get(i).getJobId().equalsIgnoreCase(ci.get(i-1).getJobId()))) {

						System.out.println("\n"+ci.get(i).getDatum());
						
						d = ci.get(i).getDatum().minusDays(1);

						if (d != null && jobs.size() != 0) {
							size = jobs.size();
							jobs.get(size - 1).setEnd(d);
						}

					}
				}
				
				j = new JobItem(ci.get(i).getJobId(), ci.get(i).getComment(), ci.get(i).getDatum(), d);
				jobs.add(j);

			}

		}
		
		jobs.get(jobs.size()-1).setEnd(ci.get(ci.size()-1).getDatum().minusDays(1));

		return jobs;

	}

}
