package org.javaCore;

public class Task_2_1_07 {
    public static void main(String[] args) {
        System.out.println(Day.SUNDAY.getRusName());
        System.out.println(Day.SUNDAY.isWeekend());
    }

    public enum Day {
        MONDAY(false, "Понедельник"),
        TUESDAY(false, "Вторник"),
        WEDNESDAY(false, "Среда"),
        THURSDAY(false, "Четверг"),
        FRIDAY(false, "Пятница"),
        SATURDAY(true, "Суббота"),
        SUNDAY(true, "Воскресенье");
        private final String day;
        private final Boolean isWeekend;

        Day(Boolean isWeekend, String day) {
            this.isWeekend = isWeekend;
            this.day = day;
        }


        public boolean isWeekend() {
            return isWeekend;
        }

        public String getRusName() {
            return day;
        }
    }
}
