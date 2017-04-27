package cn.merryyou.laoma_shuo._32;

import java.util.Calendar;

/**
 * Created by 11 on 2017/4/27.
 */
public class DateTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("year: "+calendar.get(Calendar.YEAR));
        System.out.println("month: "+calendar.get(Calendar.MONTH));
        System.out.println("day: "+calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("hour: "+calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("minute: "+calendar.get(Calendar.MINUTE));
        System.out.println("second: "+calendar.get(Calendar.SECOND));
        System.out.println("millisecond: " +calendar.get(Calendar.MILLISECOND));
        System.out.println("day_of_week: " + calendar.get(Calendar.DAY_OF_WEEK));
    }
}
