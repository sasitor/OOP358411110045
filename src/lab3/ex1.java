package lab3;

import java.util.Scanner;

public class ex1 {
    public static void main (String[]args){
        String name;

        Scanner SC = new Scanner(System.in);

        System.out.print("what is your nickname?:");
       name = SC.nextLine();
       System.out.println("Hello,"+name);
       //age
        System.out.print("how old are you?:");
        int age= SC.nextInt();
        System.out.println("you are"+age+"year old.");

        if (age>30) System.out.println("you are older");
        else System.out.println("you are younger");







    }//mai
}//class

