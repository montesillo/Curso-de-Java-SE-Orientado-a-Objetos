import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        int b = 1;
        b = i;

        Doctor myDoctor = new Doctor("Hiram", "hiram@gmail.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "5pm");
        myDoctor.addAvailableAppointment(new Date(), "6pm");
        System.out.println(myDoctor);
        /*
        for (model.Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + aA.getTime());
        }
        */
        Patient patient = new Patient("Alejandra", "alejandra@gmail.com");
        patient.setWeight(54.5);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("1243354556434");

        System.out.println(patient);
    }
}
