import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    Email emailUndertest= new Email();

    @DisplayName("shouldSetMailBoxCapacity")
    @Test
    void shouldSetMailBoxCapacity() {
        //given
        int mailBoxCapacity = 200;
        // when
        emailUndertest.setMailBoxCapacity(mailBoxCapacity);
        int actualMailBoxCapacity = emailUndertest.getMailBoxCapacity();
        // then
        assertEquals(mailBoxCapacity, actualMailBoxCapacity);
    }



    @Test
        void shouldGetMailBoxCapacity() {
            // given
            int mailBoxCapacity = 200;

            emailUndertest.setMailBoxCapacity(mailBoxCapacity);

            // when
            int resultBoxCapacity = emailUndertest.getMailBoxCapacity();

            // then
            assertEquals(mailBoxCapacity, resultBoxCapacity);
        }


    @Test
    void shouldGetAlternativeEmailSuccess() {
        // given
        String alternativeEmail = "example@gmail.com";

        emailUndertest.getAlternativeEmail(alternativeEmail);

        // when
        emailUndertest.setAlternativeEmail(alternativeEmail);
        String resultGetAlternativeEmail = emailUndertest.getAlternativeEmail(alternativeEmail);

        // then
        assertEquals(alternativeEmail, resultGetAlternativeEmail, "Alternative email should match the provided email");
    }

    @Test
    void shouldGetPassword() {
        // given
        String password= "ExapleP123";
        Email emailUndertest = new Email();
        // when
        emailUndertest.setPassword(password);
        String resultGetPassword= emailUndertest.getPassword();
        // then
        assertEquals(password, resultGetPassword);
    }

    @Test
    void showInfo() {
        // given
        String firstName = "John";
        String lastName = "Doe";
        String department = "Sales";
        String password = "mypassword";
        String alternativeEmail = "example@gmail.com";
        Email emailUndertest = new Email(firstName, lastName);

        // when
     //   emailUndertest.setDepartmentTest();
        emailUndertest.setPassword(password);
        emailUndertest.setAlternativeEmail(alternativeEmail);
        String resultShowInfo = emailUndertest.showInfo();

        // then
        String expectedInfo = "DISPLAY NAME: " + firstName + " " + lastName + "\n" +
                "DEPARTMENT: " + department + "\n" +
                "COMPANY EMAIL: " + emailUndertest.getEmail() + "\n" +
                "PASSWORD: " + password + "\n" +
                "ALTERNATIVE EMAIL: " + alternativeEmail;
        assertEquals(expectedInfo, resultShowInfo);
    }

}