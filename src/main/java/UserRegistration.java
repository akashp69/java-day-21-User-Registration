import java.util.regex.Pattern;

public class UserRegistration {
/*	  create parameterised method name as isValidFirstname
	  In this method function to validate the first name
	  @param first name as string
	  @return first name*/

    public static boolean isValidFirstName(String firstName) {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-z0-9]{2,}$");
/*		Regex to check valid username and compile the regex
		Pattern class contains matcher() method to find matching between given username
		and regular expression.*/

        return pattern.matcher(firstName).matches();
//		Return if the firstname matched the Regex
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
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-z0-9]{7,}$");
        return pattern.matcher(password2).matches();
    }
    public static boolean isValidPassword3(String password3) {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-z1-9]{6,}[1-9]$");
        return pattern.matcher(password3).matches();
    }
    public static boolean isValidPassword4(String password4) {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-z1-9]{5,}[@$^][1-9]$");
        return pattern.matcher(password4).matches();
    }
    public static boolean isEmailValidation(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?");
        return pattern.matcher(email).matches();
    }
    /*
     * create a main method , all program execute in main method
     * @param args no arguments
     */
    public static void main(String[] args) {
//		printing boolean value whether pattern matches given info
        System.out.println(isValidFirstName("Akash"));
        System.out.println(isValidLastName("Pakhare"));
        System.out.println(isValidPhoneNo("91 9423438559"));
        System.out.println(isValidEmail("akashpakhare499@gmail.com"));
        System.out.println(isValidPassword1("akash499"));
        System.out.println(isValidPassword2("Akash499"));
        System.out.println(isValidPassword3("Akashpakhare4"));
        System.out.println(isValidPassword4("Akash$1"));
        System.out.println(isEmailValidation("akashpakhare123@yahoo.co.in"));
    }
}