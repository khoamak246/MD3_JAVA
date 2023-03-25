package validateAccount;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAccount {
    private static Pattern pattern;
    private static  Matcher matcher;
    private static final String ACCOUNT_PATTERN = "^[a-z0-9_]{6,}$";

    public static void main(String[] args) {
        String[] checkAccounts = {"23abc_", "_abc123", "______", "123456", "abcdefg", ".@", "12345", "1234_", "abcdefg", "abcde"};
        for (String check : checkAccounts) {
            boolean checkAccount = Pattern.compile(ACCOUNT_PATTERN).matcher(check).matches();
            if (checkAccount)
                System.out.println("Right: " + check);
            else
                System.out.println("Wrong: " + check);
        }
    }
}
