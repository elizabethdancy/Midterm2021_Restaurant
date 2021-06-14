
package midtermpartc_restaurant;

import java.util.Scanner;

/**
 * This class models the user's order. The user can set the time window
 * they are looking to order food in as a number of hours from now.
 * The user order also has a list of restaurant types in an array.
 * @author Liz Dancy, 2021
 */
public class Order 
{
    public int timeOffset;//the number of hours from now that you wish to get delivery, 0 is right now
    public String name;//the name associated with the order
    public String[] constraints = {"pub style", "fast food", "family restaurant", "fine dining"};
    
    /**
     * Returns the time from now that you would like to order
     * @return the time offset
     */
    public int getTimeOffset() 
    {
        return timeOffset;
    }

    /**
     * Sets the time from now that you would like to order
     * @param timeOffset 
     */
    public void setTimeOffset(int timeOffset) 
    {
        this.timeOffset = timeOffset;
    }

    /**
     * Getter for the order's name
     * @return the name associated with the order
     */
    public String getName() 
    {
        return name;
    }

    /**
     * Setter for the order's name
     * @param name 
     */
    public void setName(String name) 
    {
        this.name = name;
    }
   
    /**
     * Constructor to take in the order's name.
     */
    public Order()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the order name");
        String givenName = sc.nextLine();
        name = givenName;
    }
}
