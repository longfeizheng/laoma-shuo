package cn.merryyou.laoma_shuo._33;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Created by 11 on 2017/4/27.
 */
public class JodaTimeTest {
    public static void main(String[] args) {
        DateTime dt = new DateTime();
        System.out.println(dt);

        DateTime dt1 = new DateTime(2016, 8, 18, 15, 20);
        DateTime dt2 = new DateTime(2016, 8, 18, 15, 20, 47);
        DateTime dt3 = new DateTime(2016, 8, 18, 15, 20, 47, 345);
        System.out.println(dt1);
        System.out.println(dt2);
        System.out.println(dt3);

        System.out.println("year: " + dt3.getYear());
        System.out.println("month: " + dt3.getMonthOfYear());
        System.out.println("day: " + dt3.getDayOfMonth());
        System.out.println("hour: " + dt3.getHourOfDay());
        System.out.println("minute: " + dt3.getMinuteOfHour());
        System.out.println("second: " + dt3.getSecondOfMinute());
        System.out.println("millisecond: " + dt3.getMillisOfSecond());
        System.out.println("day_of_week: " + dt3.getDayOfWeek());

        //格式化
        System.out.println(dt3.toString("yyyy-MM-dd HH:mm:ss"));

        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm");
        System.out.println(formatter.print(dt));

    }
}
