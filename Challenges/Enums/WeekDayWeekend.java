package Enums;

public class WeekDayWeekend {

    public enum WeekDay{
        SUNDAY(false) ,
        MONDAY(true),
        TUESDAY(true),
        WEDNESDAY(true),
        THURSDAY(true),
        FRIDAY(true),
        SATURDAY(false);

        private final boolean isWeekDay;

        WeekDay(boolean isWeekDay) {
            this.isWeekDay = isWeekDay;
        }


        public String getType(){
            return isWeekDay ? "WeekDay " : "WeekEnd" ;
        }
    }

    public static void main(String[] args) {
        for (WeekDay value : WeekDay.values()) {
            System.out.printf("%s :%s \n", value,value.getType());

        }
    }
}
