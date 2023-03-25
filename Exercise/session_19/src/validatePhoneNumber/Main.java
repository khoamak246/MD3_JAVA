package validatePhoneNumber;

import java.util.regex.Pattern;

public class Main {
    private static final String PHONE_PATTERN = "^\\([0-9]{2,}\\)\\-\\([0-9]{10,}\\)$";
    public static void main(String[] args) {
        String[] needCheck = {"(84)-(0978489648)", "(a8)-(22222222)"};
        for (String str : needCheck) {
            boolean check = Pattern.compile(PHONE_PATTERN).matcher(str).matches();
            if (check){
                System.out.println("R: " + str );
            } else {
                System.out.println("W: " + str);
            }
        }
    }
}
