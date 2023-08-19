package simple.textgui;

import java.util.Scanner;

//follow up for school.management.system package
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int option;
        int number1, number2;
        while(true){
            System.out.println("Enter your choice.  \n 1: Addition \n 2: Subtraction \n 3: Division \n 4: Multiplication \n 5: Exit ");
            option = Integer.parseInt (in.next());
             if (option==1){
                 askfornumbers();
                 number1 = Integer.parseInt (in.next());
                 number2 = Integer.parseInt (in.next());
                 float sum = number1 + number2;
                 System.out.println("The sum is : " +sum);
             } else if (option == 2) {
                 askfornumbers();
                 number1 = Integer.parseInt (in.next());
                 number2 = Integer.parseInt (in.next());
                 float diff = number1 - number2;
                 System.out.println("The difference is : " +diff);
             } else if (option == 3) {
                 askfornumbers();
                 number1 = Integer.parseInt (in.next());
                 number2 = Integer.parseInt (in.next());
                 float div = number1/number2;
                 System.out.println("The answer is : " +div);
             } else if (option == 4) {
                 askfornumbers();
                 number1 = Integer.parseInt (in.next());
                 number2 = Integer.parseInt (in.next());
                 float mult = number1 * number2;
                 System.out.println("The answer is : " +mult);
             } else if (option == 5) {
            System.out.println("Goodbye, Come again next time");
                 break;
             }else{
                 System.out.println("You have entered a wrong selection");
             }
        }
    }
    public static void askfornumbers(){

        System.out.println("Enter 2 numbers");
    }
}
