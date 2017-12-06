package ooplab3;

import java.util.Scanner;

public class TestWhileLoop {
    public static void main (String [] args) {

//while



        int n = 1;
        while (n<=10){
            System.out.print(n+" ") ;
            n++;
        }//while

        //correct Password
        int pin = 1234;
        Scanner scanner=new Scanner(System.in);
        int input = 0;
        while (input !=pin){
            System.out.print("Enter your password: ");
            input = scanner.nextInt();

        }
        System.out.print("Enter your is correctect. ");

    }












}//class
