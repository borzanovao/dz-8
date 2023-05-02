import java.util.HashMap;

public class Group {
    private Integer headManId;


    private HashMap<Integer, Student> students = new HashMap<>();
    private HashMap<Integer, Task> tasks = new HashMap<>();

    Group(Student headMan) {
        addStudent(headMan);
        switchHeadMan(headMan);
    }

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public void removeStudent(Student student) {
        students.remove(student.getId());
    }

    public void addTask(Task task) {
        tasks.put(task.getId(), task);
    }

    public void switchHeadMan(Student newHeadMan) {

        headManId = newHeadMan.getId();
    }

    public void renameStudent(Integer id, String firstName, String lastName) {
        if (students.containsKey(id)) {
            Student student = students.get(id);
            student.rename(firstName, lastName);
        }


    }
}
