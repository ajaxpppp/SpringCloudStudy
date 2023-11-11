package com.shenjun.springcloud;

import com.thoughtworks.xstream.converters.time.ZonedDateTimeConverter;
import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;

public class TimeUtil {

    @Test
    public void Time() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("TimeUtil.Time" + zonedDateTime);
    }
}
