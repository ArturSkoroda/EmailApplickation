public class EmailApp {
    public static void main(String[] args) {
    Email em1= new Email("Artur","Skoroda");
    em1.setMailBoxCapacity(500);
    em1.changePasword("NoweHasło1");
        System.out.println(em1.showInfo());
    }
}

