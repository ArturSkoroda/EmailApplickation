import java.util.ArrayList;

public class EmailApp {
    public static void main(String[] args) {

        Email em1= new Email("Artur", "Skoroda");
    em1.setMailBoxCapacity(500);
    em1.changePasword("NoweHasło1");
        em1.setAlternativeEmail("cośTam@o2.pl");
        System.out.println(em1.showInfo());
        ArrayList<Email> allEmail= new ArrayList<Email>();
        allEmail.add(em1);
        

    }
}

