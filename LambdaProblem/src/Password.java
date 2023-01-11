import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface IPassword {
    public String validate(String regex, String field);
}

public class Password {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please log in using 8 character password having one upper case and one numeric number and has exactly 1 Special Character.");
        System.out.print("Enter the Password : ");
        String field = sc.next();
        IPassword isValid = (pattern, passWord) -> {

            return "The password you have entered is " + Pattern.compile(pattern).matcher(passWord).matches();
        };

        System.out.println(isValid.validate("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*#?&]{8,}$", field));
        System.out.println("");
    }
}