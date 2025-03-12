package Numbers;

public class ConcatenateArrayString {

    public static void main(String[] args) {
        String[] str=  new String[]{"Hello" ,
                                    ",I",  "am"
                                    ,"vikash", "from",
                                    "Raigsrh" ,"Chhtisgarh "};
        StringBuilder sb = new StringBuilder();

        for (String str2 : str) {
            sb.append(str2).append(" ");

        }

        System.out.println(sb);
    }
}
