package Collection;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>(); // its contain only String type value
       //List strList = new ArrayList<>(); // this contain any type of data like int 55 and other
        strList.add("vikash");
        strList.add(" Rao");
        strList.add(1 , " saminder");
        strList.remove(0);

        if (strList.contains(" Rao")){
            System.out.println("Roo exist ");
            System.out.println(strList.indexOf(" Rao"));
        }

        // System.out.println(strList.get(0));

        for (int i = 0 ; i<strList.size();i++){
            System.out.print(strList.get(i));
        }
        for(String str : strList){ // this also work for the Array List
            System.out.println(str);
        }
    }
}
