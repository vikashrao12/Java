package Collection;

import java.util.*;

public class CustomComparator {

    public static void main(String[] args) {
        List<String> str = Arrays.asList("Bear" , "Dear","Lion ", "Ant"); // this type also crete a list
        System.out.println(str);
        sortInDescending(str);
        System.out.println(str);
    }

    public static void sortInDescending(List<String> strList){
        //Collections.sort(strList);
        //customComparator

        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2)) {
                    return 0;
                } else if (o1.charAt(0) < o2.charAt(0)) {
                    return -1;

                } else {
                    return 1;
                }
            }
            });
    }

}
