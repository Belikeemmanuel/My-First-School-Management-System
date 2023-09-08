 package school.management.system;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TextGUI {

    public static void main(String[] args) {
        Teacher Lizzy = new Teacher(1, "Lizzy", 500);
        Teacher Melissa = new Teacher(2, "Melissa", 700);
        Teacher vanderhorn = new Teacher(3, "vanderhorn", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Lizzy);
        teacherList.add(Melissa);
        teacherList.add(vanderhorn);

        Student Tamara = new Student(1, "Tamara", 4);
        Student rakshith = new Student(2, "rakshith vallaha", 12);
        Student Rabbi = new Student(3, "Rabbi", 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Tamara);
        studentList.add(rakshith);
        studentList.add(Rabbi);

        Tamara.payFees(5000);
        rakshith.payFees(2000);

        Scanner in = new Scanner(System.in);
        int input;
        int sid;
        while (true) {
            System.out.println(" Welcome to GHS Money management system \n What would you like to do?" +
                    "\n 1. Keep track of total amount paid by student \n 2. Pay Teacher's salary \n " +
                    "3. Add new student \n 4. Add new Teacher ");
            input = Integer.parseInt(in.next());
            if (input == 1) {
                System.out.println(" Enter student id");
                sid = Integer.parseInt(in.next());
                if (sid == 1)
                {
                    System.out.println("The student with id number " + sid + " has paid " + Tamara.getFeesPaid());
                } else if (sid == 2) {
                    System.out.println("The student with id number " + sid + " has paid " + rakshith.getFeesPaid());
                } else if (sid == 3) {
                    System.out.println("The student with id number " + sid + " has paid " + Rabbi.getFeesPaid());
                }else {
                    System.out.println("the id you entered does not exist");
                }

            }
        }
    }}
