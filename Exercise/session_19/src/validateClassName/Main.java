package validateClassName;

import java.util.regex.Pattern;

public class Main {
    private static final String NAME_PATTERN = "^(C|A|P)[0-9]{4,}(G|H|I|K|L|M)$";
    private static final String[] needCheckName = {"C0318G", "M0318G", "P0323A"};
    public static void main(String[] args) {
        for (String str : needCheckName){
        boolean check = Pattern.compile(NAME_PATTERN).matcher(str).matches();
            if (check){
                System.out.println("R: " + str );
            }else {
                System.out.println("W: " + str);
            }
        }

    }
}
