import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface FName {
    public String validate(String regex, String field);
}

public class FirstName {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name :");
        String field = sc.next();
        FName isValidFirstName = (pattern, firstName) -> {
            return "The input provided is " + Pattern.compile(pattern).matcher(firstName).matches();
        };

        System.out.println(isValidFirstName.validate("^[A-Z]{1}[a-z]{3,9}$", field));
    }
}