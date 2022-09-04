
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    Boolean result;
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        result = UserRegistration.isValidFirstName("Akash");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenFirstName_WhenImProper_ShouldReturnInvalidMessage() {
        try {
            UserRegistration.isValidFirstName("akash1.23a");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        result = UserRegistration.isValidLastName("Pakhare");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenLastName_WhenImProper_ShouldReturnInvalidMesage() {
        try {
            UserRegistration.isValidLastName("Pakhare.1");
        }catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_LAST_NAME, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenProperEmailShouldReturnTrue() {
        result = UserRegistration.isValidEmail("akashpakhare499@gmail.co.in");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenImProperEmailShouldReturnInvalidMessage() {
        try {
            UserRegistration.isValidEmail("akashpakhare499.gmail.co.in1");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_EMAIL, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenProperPhoneNumberShouldReturnTure() {
        result = UserRegistration.isValidPhoneNo("91 9423438559");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenImProperPhoneNumberShouldReturnInvalidMessage() {
        try {
            UserRegistration.isValidPhoneNo("89 55655668");
        }catch (UserRegistrationException e){
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PHONE_NUMBER, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenProperPassword1ShouldReturnTrue() {
        result = UserRegistration.isValidPassword1("akashpakhare");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenImProperPassword1ShouldInvalidMessage() {
        try {
            UserRegistration.isValidPassword1("Akash4");
        }catch (UserRegistrationException e){
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenProperPassword2ShouldReturnTrue() {
        result = UserRegistration.isValidPassword2("Akashpakhare");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenImProperPassword2ShouldInvalidMessage() {
        try {
            UserRegistration.isValidPassword1("akashpakhare4");
        }catch (UserRegistrationException e){
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void givenProperPassword3ShouldReturnTrue() {
        result = UserRegistration.isValidPassword3("Akashpakhare4");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenImProperPassword3ShouldInvalidMessage() {
        try {
            UserRegistration.isValidPassword3("Akash");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void givenProperPassword4ShouldReturnTrue() {
        result = UserRegistration.isValidPassword4("Akash@123");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenImProperPassword4ShouldInvalidMessage() {
        try {
            UserRegistration.isValidPassword4("Akash1234");
        }catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }
}