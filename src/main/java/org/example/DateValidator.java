package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateValidator {

    public static void validate(JobItem item) {

        if(item.getStart().isAfter(item.getEnd())){

            DateException d = new DateException();
            throw d;

        }

    }
}
