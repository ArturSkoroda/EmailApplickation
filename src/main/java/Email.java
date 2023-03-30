import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String alternativeEmail;
    private String email;
    private String newPassword;
    private final String cmopanyName = "newCompany.com";
    private int mailBoxCapacity = 200;
    private final int passwodrLength = 10;

    public Email() {
    }


    public Email(String firstName, String lastName) {
        this.firstName = setName();
        this.lastName = setSurname();
        this.department = setDepartment();
        System.out.println(("Department :" + this.department));
        this.password = randomPassword(passwodrLength);
        System.out.println("Your Pasword is " + this.password);

        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + cmopanyName;
        System.out.println("Your Email adrss is :" + email);
    }

    private String setName() {
        System.out.println("Enter first name for new employee");
        Scanner in = new Scanner(System.in);
        String firstName = in.nextLine();
        return firstName;
    }

    private String setSurname() {
        System.out.println("Enter surname name for new employee");
        Scanner in = new Scanner(System.in);
        String surname = in.nextLine();
        return surname;
    }


    private String setDepartment() {
        System.out.println("Enter the department " +
                "\n1 for Sles" +
                "\n2 for Development" +
                "\n3 for Accounting" +
                "\n0 for none  ");
        Scanner in = new Scanner(System.in);
        try {
            int depChoice = in.nextInt();

            if (depChoice == 0) {
                return "none";
            } else if (depChoice == 1) {
                return "sles";
            } else if (depChoice == 2) {
                return "dev";
            } else if (depChoice == 3) {
                return "acct";
            } else {
                return "";
            }
        } catch (Exception e) {
            System.out.println("Please enter number from 0 to 3");
        }
        return setDepartment();
    }

    private String randomPassword(int length) {
        String paswordSet = "ABCDEFGHIJKLMNOPRSTQUWXYZabcdefghijklmnoprstquwxyz0123456789!@#$%^&*()_-";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * paswordSet.length());
            password[i] = paswordSet.charAt(rand);
        }
        return new String(password);
    }

    public void setMailBoxCapacity(int capacity) {
        this.mailBoxCapacity = capacity;
    }


    public void setAlternativeEmail(String altEmail) {
        this.alternativeEmail = altEmail;
    }


    public void changePasword(String password) {
        this.password = password;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public String getAlternativeEmail(String alternativeEmail) {
        return this.alternativeEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "\n DISPLAY NAME " + firstName + " " + lastName +
                "\n COMPANY EMAIL " + email +
                "\n MAILBOX CAPACITY " + mailBoxCapacity + "mb";
    }


    public void setPassword(String password) {
        this.password = password;

    }

    public void changePassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getEmail() {return email;
    }
}
