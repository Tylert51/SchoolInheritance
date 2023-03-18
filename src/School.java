public class School {
    private String name;
    private String borough;
    private int numKids;

    public School(String n, String b, int num) {
        name = n;
        borough = b;
        numKids = num;
    }

    public String getName() {
        return name;
    }

    public String getBorough() {
        return borough;
    }

    public int getNumKids() {
        return numKids;
    }

    public void acceptStudent(String student) {
        int rand = (int) (Math.random() * 10) + 1;

        if(rand <= 4) {
            System.out.println(student + " has been accepted!");
        }
    }


}
