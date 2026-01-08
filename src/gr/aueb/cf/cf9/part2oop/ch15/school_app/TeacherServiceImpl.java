package gr.aueb.cf.cf9.part2oop.ch15.school_app;

/**
 * A Mock implementation of {@link ITeacherService}.
 */
public class TeacherServiceImpl implements ITeacherService {

    @Override
    public void addTeacher(Teacher teacher) {
        System.out.println("Teacher added successfully");
    }

    @Override
    public void updateTeacher(Teacher teacher) {
        System.out.println("Teacher updated successfully");
    }

    @Override
    public void removeTeacher(long id) {
        System.out.println("Teacher removed successfully");
    }

    @Override
    public Teacher getTeacherById(long id) {
        return new Teacher(1L, "Athanassios", "Androutsos");
    }

    @Override
    public Teacher[] getAllTeachers() {
        return new Teacher[] {
                new Teacher(1L, "Athanassios", "Androutsos"),
                new Teacher(2L, "Pavlos", "Georgiou"),
                new Teacher(3L, "Dimitrios", "Koutsopoulos"),
                new Teacher(4L, "Georgios", "Papadoupos"),
        };
    }
}
