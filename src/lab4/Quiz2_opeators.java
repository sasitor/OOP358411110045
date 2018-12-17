package lab4;

import java.util.Scanner;

public class Quiz2_opeators {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int x,y;
                System.out.print("Enter integer1:");
        x= SC.nextInt();
        System.out.print("Enter integer2:");
        y= SC.nextInt();
        //call methods
        System.out.println("sum;" +sumt(x,y));
        System.out.println("sub;" +subt(x,y));
        System.out.println("Mul;" +Mult(x,y));
        System.out.println("div;" +divt(x,y));
    }//main

    public static int divt (int x,int y) {
        return x / y;
    }//

    public static int Mult (int x,int y){
        return x*y;
    }//
    public static int subt (int x,int y){
    return x-y;
    }//subt
    public static int sumt (int x,int y){
    return  x+y;
    } //sumt

}//class
