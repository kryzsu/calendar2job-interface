package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MethodsTest {

    @Test
    void conversionTest(){

        LocalDate d = LocalDate.parse("2023-03-07");
        LocalDate d2 = LocalDate.parse("2023-03-11");
        LocalDate d3 = LocalDate.parse("2023-03-12");

        CalendarItem egy = new CalendarItem(d, "job1", true, "job neve", 2);
        CalendarItem k = new CalendarItem(d2, "", false, "", 3);
        CalendarItem h = new CalendarItem(d3, "job2", true, "job neve2", 6);

        List<CalendarItem> list = new ArrayList<CalendarItem>();
        list.add(egy);
        list.add(k);
        list.add(h);

        JobItem item = Methods.conversion(list).get(Methods.conversion(list).size()-1);
        JobItem jo = new JobItem("job2", "job neve2", d3, d3.minusDays(1));

        assertEquals(jo, item);

    }

}