//Name-Tasfique
//Task2
package labtask2;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
       
       //declaration of variables
        double meal, tax, total, newtax, newtotal, tip;
        Scanner read = new Scanner (System.in);
        
        //inputing data
        System.out.println("Enter Meal Charge: ");
       meal = read.nextDouble();
       System.out.println("Enter Tax Rate (%): ");
       tax = read.nextDouble();
       
       //calculation
       newtax = tax/100;
       total = meal * newtax;
       newtotal = meal + total;
       tip = newtotal * 0.15;
       
       //display result
       System.out.println("Total charge is MYR" + newtotal);
       System.out.println("Tip amount is MYR" + tip);
    }
}