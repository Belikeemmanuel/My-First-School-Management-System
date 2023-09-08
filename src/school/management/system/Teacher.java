package school.management.system;

/**
 * This class is responsible for keeping track of Teacher's id, name and salary.
 */
public class Teacher {


    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * creates a new teacher's object
     * @param id id of the teacher.
     * @param name name of the teacher.
     * @param salary salary of the teacher.
     */
    public Teacher(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned = 0;
    }

    /**
     *
     * @return id of the teacher
     */
    public int getId(){
        return id;
    }

    /**
     *
     * @return name of the teacher
     */
    public String getName(){
        return name;
    }

    /**
     *
     * @return salary of the teacher
     */
    public int getSalary(){
        return salary;
    }

    /**
     * set the salary
     * @param salary
     */
    public void setSalary(int salary){
        this.salary= salary;
    }

    /**
     * Adds to salaryEarned
     * Removes from the total money earned by the school
     * @param salary
     */
    public void recievesalary(int salary){
        salaryEarned += salary;
        School.updatetotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Teacher's name is : " +name+ " Total salary earned so far: $" +salaryEarned;
    }
}
