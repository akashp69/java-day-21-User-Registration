import java.util.regex.Pattern;

public class UserRegistration {


    public static boolean isValidFirstName(String firstName) {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-z0-9]{2,}$");


        return pattern.matcher(firstName).matches();

    }
    public static boolean isValidLastName(String lastName) {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-z0-9]{2,}$");
        return pattern.matcher(lastName).matches();
    }
    public static boolean isValidPhoneNo(String phoneNo) {
        Pattern pattern = Pattern.compile("^[0-9]{1,2} \\d{10}$");
        return pattern.matcher(phoneNo).matches();
    }
    public static boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?");
        return pattern.matcher(email).matches();
    }
    public static boolean isValidPassword1(String password1) {
        Pattern pattern = Pattern.compile("^[a-zA-z0-9]{8,}$");
        return pattern.matcher(password1).matches();
    }
    public static boolean isValidPassword2(String password2) {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-z0-9]{8,}$");
        return pattern.matcher(password2).matches();
    }
    public static boolean isValidPassword3(String password3) {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-z1-9]{6,}[1-9]$");
        return pattern.matcher(password3).matches();
    }

    public static void main(String[] args) {
        System.out.println(isValidFirstName("Akash"));
        System.out.println(isValidLastName("Pakhare"));
        System.out.println(isValidPhoneNo("91 9423438559"));
        System.out.println(isValidEmail("akashpakhare499@gmail.com"));
        System.out.println(isValidPassword1("akash499"));
        System.out.println(isValidPassword2("Akash499"));
        System.out.println(isValidPassword3("Akashpakhare4"));
    }
}