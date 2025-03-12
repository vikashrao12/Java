package Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,5,1,6,3,4,4);
        System.out.println(Collections.frequency(list,1)); //frequency is number of occurrence
    }
}
