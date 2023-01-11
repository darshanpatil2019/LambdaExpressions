import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface IContactNum {
    public String validate(String regex, String inputStr);
}

public class ContactNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a valid contact number : ");
        String input = scanner.nextLine();
        IContactNum isValidContactNum = (pattern, contactNum) -> {
            return "The input provided is " + Pattern.compile(pattern).matcher(contactNum).matches();
        };
        System.out.println(isValidContactNum.validate("^[0-9]{2}\\s{1}[0-9]{10}$", input));
    }
}
