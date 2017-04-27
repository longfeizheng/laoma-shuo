package cn.merryyou.laoma_shuo._33;

import org.joda.time.DateTime;
import org.joda.time.Period;

/**
 * Created by 11 on 2017/4/27.
 */
public class JodaTimeTest_1 {
    public static void main(String[] args) {
        DateTime dt = new DateTime();
        //设置时间为下午3点20  withxxxx设置绝对时间
        dt = dt.withHourOfDay(15).withMinuteOfHour(20);
        System.out.println(dt);
        //三小时五分钟后    plusxxx和minusxxx 用于增加和减少时间
        DateTime dt1 = new DateTime().plusHours(3).plusMinutes(5);
        System.out.println(dt1.toString());
        //今天0点
        DateTime dt2 =  new DateTime().withMillisOfDay(0);
        System.out.println(dt2.toString());
        //下周二上午10点
        DateTime dt3 = new DateTime().plusWeeks(1).withDayOfWeek(2)
                .withMillisOfDay(0).withHourOfDay(10);

        //计算时间差
        DateTime start = new DateTime(2016,8,18,10,58);
        DateTime end = new DateTime(2016,9,19,12,3);
        Period period = new Period(start,end);
        System.out.println(period.getMonths()+"月"+period.getDays()+"天"
                +period.getHours()+"小时"+period.getMinutes()+"分");
    }
}
