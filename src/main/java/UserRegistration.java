import java.util.regex.Pattern;

public class UserRegistration {

    public static String isValidFirstName(String firstName) {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{2,}$");

        if(pattern.matcher(firstName).matches()){
            return "Happy";
        }else
            return "Sad";

    }
    public static String isValidLastName(String lastName) {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{2,}$");
        if(pattern.matcher(lastName).matches()){
            return "Happy";
        }else
            return "Sad";
    }
    public static String isValidPhoneNo(String phoneNo) {
        Pattern pattern = Pattern.compile("^[0-9]{1,2} \\d{10}$");
        if(pattern.matcher(phoneNo).matches()){
            return "Happy";
        }else
            return "Sad";
    }
    public static String isValidEmail(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?");
        if(pattern.matcher(email).matches()){
            return "Happy";
        }else
            return "Sad";
    }
    public static String  isValidPassword1(String password1) {
        Pattern pattern = Pattern.compile("^[a-zA-z0-9]{8,}$");
        if(pattern.matcher(password1).matches()){
            return "Happy";
        }else
            return "Sad";
    }
    public static String isValidPassword2(String password2) {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z0-9]{7,}$");
        if(pattern.matcher(password2).matches()){
            return "Happy";
        }else
            return "Sad";
    }
    public static String isValidPassword3(String password3) {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z1-9]{6,}[1-9]$");
        if(pattern.matcher(password3).matches()){
            return "Happy";
        }else
            return "Sad";
    }
    public static String isValidPassword4(String password4) {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z1-9]{5,}[@$^][1-9]+$");
        if(pattern.matcher(password4).matches()){
            return "Happy";
        }else
            return "Sad";
    }
    public static boolean isEmailValidation(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?");
        return pattern.matcher(email).matches();
    }



    public static void main(String[] args) {

        System.out.println(isValidFirstName("Akash"));
        System.out.println(isValidLastName("Pakhare"));
        System.out.println(isValidPhoneNo("91 9423438559"));
        System.out.println(isValidEmail("akashpakhare499@gmail.com"));
        System.out.println(isValidPassword1("akash499"));
        System.out.println(isValidPassword2("Akash499"));
        System.out.println(isValidPassword3("Akashpakhare4"));
        System.out.println(isValidPassword4("Akash$4"));
        System.out.println(isEmailValidation("akashpakhare123@yahoo.co.in"));
    }
}