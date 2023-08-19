package school.management.system;

import java.util.List;

<<<<<<< HEAD
/**
=======

/**;/
>>>>>>> 93cdb7c (Initial version)
 * Many teachers, Many Students.
 * Making use of ArrayList to implement teachers and students.
 */
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new school object is created.
     * @param teachers list of teachers in the school.
     * @param students list of students in the school.
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    /**
     * @return the list of the teachers
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Adds a  teacher to the school
     * @param teacher to be added
     */
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * @return the list of the students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Adds a student to the school.
     * @param student to be added
     */
    public void addStudents(Student student) {
        students.add(student);
    }

    /**
     * @return the total money earned
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money earned by the school
     * @param MoneyEarned money supposed to be added
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned+= MoneyEarned;
    }

    /**
     *
     * @return the total money spent by the school
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     *update the total money spent by the school which is
     *the money given out as salary by the school to teachers
     * @param MoneySpent by the school
     */
    public static void updatetotalMoneySpent(int MoneySpent) {
        totalMoneyEarned -= MoneySpent;
    }
}
