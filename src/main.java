import models.Measurement;

public class main {
    public static void main(String[] args) {
        Measurement meas = new Measurement(100);
        System.out.println(meas.getcm()+ "cm");
        System.out.println(meas.getKm()+ "Km");
        System.out.println(meas.getMm()+ "Mm");
        System.out.println(meas.getDm()+ "Dm");

    }
}
