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
        int count =0;
        while (input !=pin){

            System.out.print("Enter your password: ");
            input = scanner.nextInt();
            count++;
            if (input ==pin){
                System.out.print("Enter your is correctect. ");break;
            }
            if (count ==3){
                System.out.print("System error.");break;
            }
        }


    }












}//class
