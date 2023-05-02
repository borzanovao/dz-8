import java.util.HashMap;

public class StudentsGroup {
    private final Student headMan;

    HashMap<Integer, Student> students = new HashMap<>();
    StudentsGroup(Student headMan) {
        this.headMan = headMan;
    }

}
