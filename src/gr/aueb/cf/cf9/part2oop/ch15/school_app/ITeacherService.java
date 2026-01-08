package gr.aueb.cf.cf9.part2oop.ch15.school_app;

/**
 * Provides common CRUD operations for Teachers.
 */
public interface ITeacherService {

    /**
     * Creates a new teacher.
     * @param teacher the teacher instance to add.
     */
    void addTeacher(Teacher teacher);

    /**
     * Updates an existing teacher.
     * @param teacher the teacher instance with updated details.
     */
    void updateTeacher(Teacher teacher);

    /**
     * Removes a teacher by their ID.
     * @param id the unique identifier of the teacher.
     */
    void removeTeacher(long id);

    /**
     * Finds a teacher by ID.
     * @param id the unique identifier.
     * @return the Teacher object if found, otherwise null (or throw generic exception).
     */
    Teacher getTeacherById(long id);

    /**
     * Retrieves all registered teachers.
     * @return an array of Teachers.
     */
    Teacher[]  getAllTeachers();
}
