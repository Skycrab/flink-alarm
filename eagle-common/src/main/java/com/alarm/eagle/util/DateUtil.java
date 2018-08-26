package com.alarm.eagle.util;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

/**
 * Created by skycrab on 17/12/23.
 */
public class DateUtil {

    private static final DateTimeFormatter YMD_HMS = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");

    /**
     * 时间转化为时间戳
     * @param ymdhms
     * @return
     */
    public static long unixTimestamp(String ymdhms) {
        return YMD_HMS.parseMillis(ymdhms);
    }

    public static long unixTimestamp(Date date) {
        DateTime dateTime = new DateTime(date);
        return dateTime.getMillis();
    }

    /**
     * 时间戳转化为时间
     * @param timestamp
     * @return
     */
    public static String fromUnixtime(long timestamp) {
        return YMD_HMS.print(timestamp);
    }

    public static DateTime toDate(String ymdhms) {
        DateTime d = YMD_HMS.parseDateTime(ymdhms);
        return d;
    }

    public static int hour(String ymdhms) {
        DateTime d = toDate(ymdhms);
        return d.getHourOfDay();
    }

    public static int hour() {
        DateTime d = DateTime.now();
        return d.getHourOfDay();
    }
}
