public class Student {
    private volatile static int idBase = 0;

    private final int id;
    private String firstName;
    private String lastName;

    Student(String firstName, String lastName) {
        this.id = idBase++;
        rename(firstName, lastName);

    }


    public int getId() {

        return id;
    }


    public void rename(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
