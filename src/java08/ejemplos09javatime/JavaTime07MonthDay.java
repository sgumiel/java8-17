package java08.ejemplos09javatime;

import java.time.MonthDay;

public class JavaTime07MonthDay {

    public static void main(String[] args) {

        MonthDay today = MonthDay.now();
        System.out.println(today);

        MonthDay aprilFirst = MonthDay.of(4,1);
        System.out.println(aprilFirst);

        Boolean todayIsBeforeAprilFirst = aprilFirst.isAfter(today);
        System.out.println(todayIsBeforeAprilFirst);
    }
}
