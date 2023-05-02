public class Students {
    private volatile static int  idBase = 0;

    private final int id;
    private final String firstName;
    private final String lastName;

    Students(String firstName, String lastName) {
        this.id = idBase++;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public int getId() {
        return id;
    }


}
