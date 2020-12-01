package com.wuyson.common.util;

import android.annotation.TargetApi;
import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author Wuyson
 * @create_time: 2020/12/1
 */
public class DateUtils {

    /**
     * @return the current time in seconds
     */
    public static long currentTimeSeconds() {
        return System.currentTimeMillis()/1000;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static int currentLengthOfYear(){
        return LocalDate.now().lengthOfYear();
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static int lengthOfYear(int year, int month, int day){
        return LocalDate.of(year, month, day).lengthOfYear();
    }
    
    @TargetApi(Build.VERSION_CODES.O)
    public static long getEpochSecond1(){
        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.systemDefault());
        return zonedDateTime.toEpochSecond();
    }

    @TargetApi(Build.VERSION_CODES.O)
    public static long getEpochSecond() {
        Instant instant = Instant.now(Clock.system(ZoneId.systemDefault()));
        return instant.getEpochSecond();
    }
}
