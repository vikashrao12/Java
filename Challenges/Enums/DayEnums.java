package Enums;



public enum DayEnums {



        SUNDAY , MONDAY ,TUESDAY, WEDNESDAY ,THURSDAY ,FRIDAY ,SATURDAY;

    public static void main(String[] args) {

       // System.out.println(DayEnums.FRIDAY);
        // DayEnums.Values its create  an array of the days
        for (DayEnums v : DayEnums.values()) {
            System.out.println(v);

        }
    }

}
