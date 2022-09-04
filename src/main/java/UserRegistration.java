import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean isValidfirstName(String firstName) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-zA-z0-9]{2,}$");
        return pattern.matcher(firstName).matches();
    }
    public static boolean isValidlastName(String lastName) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-zA-z0-9]{2,}$");
        return pattern.matcher(lastName).matches();
    }
    public static void main(String[] args) {
        System.out.println(isValidfirstName("Akash"));
        System.out.println(isValidlastName("Pakhare"));
    }
}