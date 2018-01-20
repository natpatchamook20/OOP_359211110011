package midterm;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Year = 2561;
        for(int a=1;a<=3;a++){
            System.out.print("Enter YearAge1 :");
            int Age1 = input.nextInt();
            if ( Age1>=0)
                Age1 = (Year-Age1 );
            System.out.println("Age1:"+Age1);
            //Age1
            System.out.print("Enter YearAge2 :");
            int Age2 = input.nextInt();
            if (Age2>=0)
                Age2 = (Year-Age2 );
            System.out.println("Age2:"+Age2);
            //Age2
            System.out.print("Enter YearAge3 :");
            int Age3 = input.nextInt();
            if (Age3>=0)
                Age3 = (Year-Age3 );
            System.out.println("Age3:"+Age3);
            System.out.println("Thank you");
            System.out.println("\n ");
            //Age3
        }
    }
}

