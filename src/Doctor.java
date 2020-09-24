import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    static int id = 0;//Autoincrement
    private String name;
    private String email;
    private String speciality;



    Doctor(){
        System.out.println("Construyendo el Objeto Doctor");

    }

    Doctor(String name, String speciality){
        System.out.println("El nombre del Doctor asignado es: " + name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }
    //Comportamientos
    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("ID Doctor: " + id);
    }
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAcailableAppointment(Date date, String time){
        availableAppointments.add(new AvailableAppointment(date, time));
    }
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }
    public static class AvailableAppointment{
        private int id_availableAppointment;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time){
            this.date = date;
            this.time = time;
        }
        public Date getDate() {
            return date;
        }
        public void setDate(Date sate) {
            this.date = sate;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }



    }
}
