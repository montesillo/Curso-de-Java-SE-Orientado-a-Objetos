import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        int b = 1;
        b = i;

        Doctor myDoctor = new Doctor("Hiram", "Programador");
        myDoctor.addAcailableAppointment(new Date(), "4pm");
        myDoctor.addAcailableAppointment(new Date(), "5pm");
        myDoctor.addAcailableAppointment(new Date(), "6pm");

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + aA.getTime());
        }

        Patient patient = new Patient("Alejandra", "alejandra@gmail.com");
        patient.setWeight(54.5);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("1243354556434");
    }
}
