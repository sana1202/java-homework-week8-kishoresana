package methodoverriding24;

public class Test2 {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();
        System.out.println(" SBI Rate of Interest: " + sbi.getRateOfInterest());
        System.out.println(" ICICI Rate of Interest: " + icici.getRateOfInterest());
        System.out.println(" AXIS Rate of Interest: " + axis.getRateOfInterest());
    }
}
