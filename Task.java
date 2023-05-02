public class Task {
    private volatile static int  idBase = 0;

    private final int id;
    private final String description;


    Task(String description) {
        this.id = idBase++;
        this.description = description;


    }

    public int getId() {
        return id;
    }


}

