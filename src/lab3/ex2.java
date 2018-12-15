package lab3;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        String name;
        Scanner SC = new Scanner(System.in);
        //name

        System.out.print("what is your nickname?:");
        name = SC.nextLine();
        System.out.println("Hello," + name);

        //age
        System.out.print("how old are you?:");
        int age= SC.nextInt();
        System.out.println("you are"+age+"year old.");


        //address
        System.out.print("What address are you:");
        int address= SC.nextInt();
        System.out.println("you address" +address);

        //Telephone
        System.out.print("What Telephone are you:");
        int Telephone= SC.nextInt();
        System.out.println("you Telephone" +Telephone);

String sex;
        Scanner se = new Scanner(System.in);
        //sex
        System.out.print("What sex are you:");
         sex= se.nextLine();
        System.out.println("sex" +sex);

    }//main
}//class
