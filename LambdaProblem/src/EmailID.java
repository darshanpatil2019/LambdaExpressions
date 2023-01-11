import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface IEmailID {
    public String validate(String regex, String inputStr);
}

public class EmailID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email : ");
        String input = scanner.next();
        IEmailID isValidateEmail = (pattern, email) -> {
            return "The input provided is " + Pattern.compile(pattern).matcher(email).matches();
        };
        System.out.println(isValidateEmail.validate("^[A-Za-z0-9]{1,}(.+)[A-Za-z0-9]{1,}+(@+)bl+(.+)[co]*(.[A-Za-z]{2})$", input));
    }
}