
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {
    String result;
    private Assertions Assert;

    @Test
    public void firstName_IsValid_PassTest() {
        result = UserRegistration.isValidFirstName("Akash");
        Assertions Assert = null;
        Assert.assertEquals("Happy", result);
    }
    @Test
    public void firstName_IsValid_FailTest() {
        result = UserRegistration.isValidFirstName("Akash123a");
        Assertions Assert = null;
        Assert.assertEquals("Sad",result);
    }

    @Test
    public void lastName_IsValid_PassTest() {
        result = String.valueOf(UserRegistration.isValidLastName("Pakhare"));
        Assert.assertEquals("Happy",result);
    }
    @Test
    public void lastName_IsValid_FailTest() {
        result = UserRegistration.isValidLastName("Pakhare");
        Assert.assertEquals("Sad",result);
    }

    @Test
    public void Email_IsValid_PassTest() {
        result = UserRegistration.isValidEmail("akashpakhare499@gmail.co.in");
        Assert.assertEquals("Happy",result);
    }

    @Test
    public void Email_IsValid_FailTest() {
        result = UserRegistration.isValidEmail("akashpakhare499gmail.co.in");
        Assert.assertEquals("Sad",result);
    }

    @Test
    public void phoneNumber_isValidMobileNo() {
        result = UserRegistration.isValidPhoneNo("91 9423438559");
        Assert.assertEquals("Happy",result);
    }

    @Test
    public void phoneNumber_IsValid_FailTest() {
        result = UserRegistration.isValidPhoneNo("89 77155648");
        Assert.assertEquals("Sad",result);
    }

    @Test
    public void password_IsValid_PassTest1() {
        result = UserRegistration.isValidPassword1("akashpakhare");
        Assert.assertEquals("Happy",result);
    }
    @Test
    public void password_IsValid_FailTest1() {
        result = UserRegistration.isValidPassword1("Akash499");
        Assert.assertEquals("Sad",result);
    }

    @Test
    public void password_IsValid_PassTest2() {
        result = UserRegistration.isValidPassword2("Akashpakhare");
        Assert.assertEquals("Happy", result);
    }
    @Test
    public void password_IsValid_FailTest2() {
        result = UserRegistration.isValidPassword2("akashpakhare4");
        Assert.assertEquals("Sad", result);
    }
    @Test
    public void password_IsValid_PassTest3() {
        result = UserRegistration.isValidPassword3("Akashpakhare4");
        Assert.assertEquals("Happy", result);
    }
    @Test
    public void password_IsValid_FailTest3() {
        result = UserRegistration.isValidPassword3("Akashpakhare");
        Assert.assertEquals("Sad", result);
    }
    @Test
    public void password_IsValid_PassTest4() {
        result = UserRegistration.isValidPassword4("Akash@123");
        Assert.assertEquals("Happy", result);
    }
    @Test
    public void password_IsValid_FailTest4() {
        result = UserRegistration.isValidPassword4("Akash1234");
        Assert.assertEquals("Sad", result);
    }
}
