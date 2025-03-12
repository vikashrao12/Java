package Collection;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        Set <String> name = new HashSet<>();
        name.add("vikash");
        name.add("Akash");
        name.add("priyanka");
        Utility.print(name);  // set oder are not fixed

        name.add("vikash"); // dublicate value not allow
        Utility.print(name);
        name.remove("vikash");
        name.contains("akash"); // check if the exist in the list or not
        Utility.print(name);
    }
}
