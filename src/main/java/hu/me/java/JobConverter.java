package hu.me.java;

import hu.me.java.model.Calendar;
import hu.me.java.model.Job;

import java.util.List;

public interface JobConverter {
    List<Job> from(List<Calendar> calendarItemList);
}
