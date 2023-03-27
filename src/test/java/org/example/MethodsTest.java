package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class MethodsTest {

    @Test
    void conversionTest_HappyPass(){

        // GIVEN

        LocalDate d = LocalDate.parse("2023-03-07");
        LocalDate d2 = LocalDate.parse("2023-03-09");
        LocalDate d3 = LocalDate.parse("2023-03-11");
        CalendarItem egy = new CalendarItem(d, "job1", true, "job neve", 2);
        CalendarItem k = new CalendarItem(d2, "", false, "", 4);
        CalendarItem h = new CalendarItem(d3, "job3", true, "job neve3", 6);
        List<CalendarItem> list = new ArrayList<>();
        list.add(egy);
        list.add(k);
        list.add(h);
        JobItem jo1 = new JobItem("job1", "job neve", d, d2.minusDays(1));
        JobItem jo2 = new JobItem("job3", "job neve3", d3, d3);

        // WHEN

        List<JobItem> items = Methods.conversion(list);

        // THEN

        assertEquals(jo1, items.get(0));
        assertEquals(jo2, items.get(1));

    }

    @Test
    void conversionTest_NullGiven(){

        // GIVEN

        CalendarItem egy = null;
        List<CalendarItem> list = new ArrayList<>();
        list.add(egy);

        // WHEN THEN

        assertThrows(NullPointerException.class, () -> Methods.conversion(list).get(0));

    }

    @Test
    void conversionTest_IdNull(){

        // GIVEN

        LocalDate d = LocalDate.parse("2023-03-07");
        CalendarItem egy = new CalendarItem(d, null, true, "job neve", 2);
        List<CalendarItem> list = new ArrayList<>();
        list.add(egy);

        // WHEN THEN

        assertThrows(NullPointerException.class, () -> Methods.conversion(list).get(0).getId());

    }

    @Test
    void conversionTest_NameNull(){

        // GIVEN

        LocalDate d = LocalDate.parse("2023-03-07");
        LocalDate d2 = LocalDate.parse("2023-03-10");
        CalendarItem egy = new CalendarItem(d, "job1", true, null, 2);
        CalendarItem k = new CalendarItem(d2, "job2", true, null, 6);
        List<CalendarItem> list = new ArrayList<>();
        list.add(egy);
        list.add(k);

        // WHEN

        String name  = Methods.conversion(list).get(1).getName();

        // THEN

        assertNull(name);

    }

    @Test
    void conversionTest_DateNull(){

        // GIVEN

        CalendarItem egy = new CalendarItem(null, "job1", true, "job neve", 2);
        CalendarItem k = new CalendarItem(null, "job2", true, "job neve2", 6);
        List<CalendarItem> list = new ArrayList<>();
        list.add(egy);
        list.add(k);

        // WHEN THEN

        assertThrows(NullPointerException.class, () -> Methods.conversion(list).get(1).getStart());
        assertThrows(NullPointerException.class, () -> Methods.conversion(list).get(1).getEnd());

    }

    @Test
    void conversionTest_EndDateIsGood(){

        LocalDate d = LocalDate.parse("2023-03-07");
        LocalDate d1 = LocalDate.parse("2023-03-08");
        JobItem item = new JobItem("job1", "job neve", d1, d);
        JobItem item2 = new JobItem("job1", "job neve", d, d1);

        assertDoesNotThrow(() -> DateValidator.validate(item2));
        assertThrows(DateException.class, () -> DateValidator.validate(item));

    }

    @Test
    void jobItemClass(){

        LocalDate d = LocalDate.parse("2023-03-07");
        JobItem jo = new JobItem("job1", "job neve", d, d);

        assertEquals("job neve", jo.getName());
        assertEquals("job1", jo.getId());
        assertEquals(d, jo.getStart());
        assertEquals(d, jo.getEnd());
        assertEquals("JobItem{" +
                "id='" + jo.getId() + '\'' +
                ", name='" + jo.getName() + '\'' +
                ", start=" + jo.getStart() +
                ", end=" + jo.getEnd() +
                '}', jo.toString());
        assertEquals(Objects.hash(jo.getId(), jo.getName(), jo.getStart(), jo.getEnd()), jo.hashCode());

    }

}