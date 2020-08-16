//Name-Tasfique
//Task3
package labtask2;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
       
         System.out.println("MILEAGE REIMBURSEMENT CALCULATOR");
         System.out.println("--------------------------------------");
         
        
       //declaration of variables
        double start, end, travel, reim;
        Scanner read = new Scanner (System.in);
        
        //inputing data
        System.out.println("Enter beginning odometer reading: ");
        start = read.nextDouble();
        System.out.println("Enter ending odometer reading: ");
        end = read.nextDouble();
       
       //calculation
       travel = end-start;
       reim = 0.65 * travel;
       
       //display result
       System.out.println("You traveled " + travel + " kilometers. ");
       System.out.println("At RM0.65 per kilometer, your reimbursement is RM" + reim);
       
    }
}