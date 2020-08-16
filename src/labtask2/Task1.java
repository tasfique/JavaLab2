//Name-Tasfique
//Task1
package labtask2;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
       
       //declaration of variables
        int interest, time;
        double amount, simple;
        Scanner read = new Scanner (System.in);
        
        //inputing data
        System.out.println("Enter The Principle Amount: ");
       amount = read.nextDouble();
       System.out.println("Enter The Rate of Interest: ");
       interest = read.nextInt();
       System.out.println("Enter The Duration: ");
       time = read.nextInt();
       
       //calculation
       simple = (amount * interest *time)/100;
       
       //display result
       System.out.println("For principle amount MYR" + amount + " with rate of " + interest + "%" + " and the time duration of " + time + "years" + " the simple interest is MYR" + simple );
       
       
       
       
       
        
    }
    
}
