package gr.aueb.cf.cf9.part2oop.ch15.school_app;

public class Main {

    public static void main(String[] args) {
        // Dependency Injection (Manual)
        // We program against the Interface (ITeacherService), not the Class.
        ITeacherService service = new TeacherServiceImpl();

        // 1. Create
        System.out.println("Add Teacher: ");
        Teacher t1 = new Teacher(10, "Alice", "W.");
        service.addTeacher(t1);

        // 2. Read All
        System.out.println("\nList All Teachers: ");
        Teacher[] teachers = service.getAllTeachers();
        for (Teacher t : teachers) {
            System.out.println(t);
        }

        // 3. Update & Delete
        System.out.println("\nUpdate & Remove: ");
        service.updateTeacher(t1);
        service.removeTeacher(10);
    }
}