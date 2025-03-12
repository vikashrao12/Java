package Collection;

public class AddStrings {
    public static void main(String[] args) {
        System.out.println(concatenate("vikash"));
        System.out.println(concatenate("rao"));

    }


    public static String concatenate(String... str){
        StringBuilder sb = new StringBuilder() ;
        for (String s : str) {
            sb.append(s).append(" ");

        }
        return sb.toString();

    }
}
