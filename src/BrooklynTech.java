public class BrooklynTech extends School {

    private boolean isBathroomOnFire;

    public BrooklynTech(String n, String b, int num, boolean fire) {
        super(n, b, num);
        isBathroomOnFire = fire;
    }

    public void litty() {
        System.out.println("Oh no, someone set the toilet on fire!!!");
        isBathroomOnFire = true;
    }

    public void extinguish() {
        System.out.println("Congrats, we extinguished the fire");
        isBathroomOnFire = false;
    }

    public void flexAudi() {
        System.out.println("That's right, we got one of the biggest auditoriums in Brooklyn right here");
    }


}
