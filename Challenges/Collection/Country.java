package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Country {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        Map<String, String> country = new HashMap<>();
        country.put("India" , "Delhi");
        country.put("Japan" , " Tokyo ");
        country.put("China" , " Beijing");
        country.put("Bangladesh","Dhaka" );
        country.put("Shrilanka" , " Colombo");

        System.out.print("Enter the country Name : ");
        String str = sc.next();
            if (country.containsKey(str)){
                System.out.printf("Capital of %s is %s ",str,country.get(str));
            }
            else {
                System.out.println("Your Country Not Found In A list ");
        }


    }
}
