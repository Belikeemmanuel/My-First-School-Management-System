package school.management.system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
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


        School ghs = new School(teacherList, studentList);

        Teacher megan = new Teacher(6, "megan vallaha",900);
        ghs.addTeachers(megan);

        Tamara.payFees(5000);
        rakshith.payFees(6000);
        System.out.println("GHS has earned $" +ghs.getTotalMoneyEarned());

        System.out.println("--------MAKING SCHOOL PAY SALARY-------");
        Lizzy.recievesalary(Lizzy.getSalary());
        System.out.println( "GHS HAS PAID $" +Lizzy.getSalary() + " TO " +Lizzy.getName()+
                " AND NOW HAS $" +ghs.getTotalMoneyEarned());

        vanderhorn.recievesalary(vanderhorn.getSalary());
        System.out.println( "GHS HAS PAID $" +vanderhorn.getSalary() + " TO " +vanderhorn.getName()+
                " AND NOW HAS $" +ghs.getTotalMoneyEarned());

        System.out.println(rakshith);

        Melissa.recievesalary(Melissa.getSalary());
        System.out.println(Melissa);



    }
}
