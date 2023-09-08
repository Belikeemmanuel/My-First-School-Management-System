package school.management.system;

//This class is responsible for keeping track of the students name, id, grade, fees paid and fees total
public class Student {


    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * a constructor is used to create a new student object by initializing
     * fees for every student is $30,000.
     * fees paid initially is 0.
     * @param id id for the student : unique
     * @param name name of the student
     * @param grade grade of the student
     */
    public Student (int id, String name, int grade) {
        this.feesPaid=0;
        this.feesTotal= 30000;
        this.id=id;
        this.name=name;
        this.grade=grade;
    }

    //Not going to alter student's name, student's id

    /**
     * Used to update the student's grade.
     * @param grade new grade of the student.
     */
    public void setGrade(int grade){
        this.grade=grade;

    }

    /**
     * Keep adding fees to feesPaid field
     * the school is going to receive the funds.
     * @param fees the amount of fees paid by the student.
     */
    public void payFees (int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     *
     * @return the id of the student
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return the name of the student
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return the grade of the student
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return the fees paid by the student
     */
    public int getFeesPaid() {return feesPaid;}

    /**
     *
     * @return the total fees of the student.
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    public int getremainingfees () {
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name is : " +name+ " Total fees paid so far : $"
                +feesPaid+ " Remaining fees total : $" +getremainingfees();
    }
}
