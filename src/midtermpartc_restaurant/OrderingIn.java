
package midtermpartc_restaurant;

import java.util.Scanner;

/**
 * This class contains a program to allow the user to select their time frame
 * that they want to order in food for today. Then they pick a type of restaurant
 * and the system displays available restaurants that can deliver in that time frame.
 * It is not complete but not meant to be completed (in functionality) for the midterm.
 * @author Liz Dancy, 2021
 */
public class OrderingIn 
{
public static void main(String[] args) 
    {
        System.out.println("Welcome to Ordering In! Hope you are hungry.");
        Order userOrder = new Order();
        //create a new ordering out reservation
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the time window you wish to order in, in hours from now (0 is right now):");
        int hoursOffset = sc.nextInt();
        userOrder.setTimeOffset(hoursOffset);//set the time window
        
        //display the constraints and have the user select one:
        System.out.println("Select your food preference ");
        for(int i=0; i< userOrder.constraints.length; i++)
        {
            System.out.println(i+1 + ". " + userOrder.constraints[i]);
        }
        int constraintNum = sc.nextInt();
        //some code to calculate the time from now and display available restaurants
        //and display it will be added in version 2 (not on midterm)
        System.out.println("Calculating restaurants that have delivery spots within: " + userOrder.getTimeOffset()+ " hours from now......");
        System.out.println("Check back after the midterm for restaurant options!");
    }
    

}
