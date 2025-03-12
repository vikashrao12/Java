package Collection;

import java.util.*;

public class TestCollections {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(6);
        number.add(8);
        number.add(1);
        number.add(-5);
        Utility.print(number);
        Collections.sort(number);
        Utility.print(number);
        Collections.reverse(number);
        Utility.print(number);
    }
}
