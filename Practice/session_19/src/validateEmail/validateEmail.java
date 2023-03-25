package validateEmail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validateEmail {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    public static final String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String[] args) {
        boolean validEmailCheck;
        for (String email: validEmail) {
            validEmailCheck = Pattern.compile(EMAIL_REGEX).matcher(email).matches();
            if (validEmailCheck){
                System.out.println("Right: " + email);
            } else {
                System.out.println("Wrong: " + email);
            }
        }
        for (String email: invalidEmail) {
            validEmailCheck = Pattern.compile(EMAIL_REGEX).matcher(email).matches();
            if (validEmailCheck){
                System.out.println("Right: " + email);
            } else {
                System.out.println("Wrong: " + email);
            }
        }

    }
}
