import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        int b = 1;
        b = i;

        Doctor myDoctor = new Doctor("Hiram", "Programador");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);
        //showMenu();

        Patient patient = new Patient("Alejandra", "alejandra@gmail.com");

    }
}
