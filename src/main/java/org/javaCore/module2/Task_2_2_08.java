package org.javaCore.module2;

public class Task_2_2_08 {
    public static void main(String[] args) {
        System.out.printf("Количество будних дней: %s, выходных дней: %s.",
                weekdayCount(new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}),
                weekendCount(new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}));
    }

    public static boolean isWeekend(String dayName) {
        return dayName.equals("Saturday") || dayName.equals("Sunday");
    }

    public static int weekendCount(String[] days) {
        int counterWeekend = 0;
        for (String day : days) {
            if (isWeekend(day)) {
                counterWeekend++;
            }
        }
        return counterWeekend;
    }

    public static int weekdayCount(String[] days) {
        return days.length - weekendCount(days);
    }
}
