public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Olha", "Petrova");
        Student student2 = new Student("Anna", "Ivanova");
        Student student3 = new Student("Oksana", "Ponomar");
        Student student4 = new Student("Serhii", "Pavlov");
        Student student5 = new Student("Oleksandr", "Podoliako");

        Group group = new Group(student3);
        group.addStudent(student2);
        group.addStudent(student1);
        group.addStudent(student3);
        group.addStudent(student4);

        group.addTask(new Task("Study Java Collections"));
        group.addTask(new Task("Investigate Java Lambda Functions"));
        group.addTask(new Task("Study OOPs Concepts"));

        group.switchHeadMan(student5);

        group.removeStudent(student1);
        group.renameStudent(student3.getId(), "Oksana", "Kravchenko");


    }

}
