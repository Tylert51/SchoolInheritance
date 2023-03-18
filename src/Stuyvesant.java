public class Stuyvesant extends School {
    private boolean escalatorsBroken;

    public Stuyvesant(String n, String b, int num, boolean e) {
        super(n, b, num);
        escalatorsBroken = e;
    }

    public boolean getEscalatorsBroken() {
        return escalatorsBroken;
    }

    public void breakEscalators() {
        System.out.println("Smh, someone just dropped their phone through the crevices and everything just stopped moving");
        escalatorsBroken = true;
    }

    public void fix() {
        System.out.println("The amazing technicians were able to repair the escalators once again!");
        escalatorsBroken = false;
    }



    public void overwhelmStudents() {
        System.out.println("Okay guys, time to write 150 five page essays which are all due tomorrow");
    }
}
