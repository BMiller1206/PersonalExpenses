//*****************************************************************************
//Name: Brent Miller
//Date: 060515
//Project Name: Average Test Scores
//Description: Suppose that the total tax you pay on your job income is 14%. 
//After paying the taxes, you spend 10% of your net income to buy new clothes 
//and other accessories for the next school year and 1% to buy school supplies.
//After buying clothes and school supplies, you use 25% of the remaining money
//to buy savings bonds. For each dollar you spend to buy savings bonds, 
//your parents spend $0.50 to buy additional savings bonds for you. 
//This program prompts the user to enter the pay rate for an hour and the number
//of hours you worked each week.
//*****************************************************************************
package personalexpenses;

import java.util.Scanner;//Scanner class which allows the user to read values of various types.
import java.text.DecimalFormat;//DecimalFormat class that allows you to format decimal numbers.
//Name of program
public class PersonalExpenses
{
    //Main
    public static void main(String[] args) 
    {
        //Declaration and initialization of variables
        Scanner in = new Scanner(System.in);
        DecimalFormat twoDecimal = new DecimalFormat("0.00");
        double incomeTax = .14;
        double clothes = .10;
        double supplies = .01;
        double myBonds = .25;
        double parentsBonds = .50;
        double payRate = 0;
        double hoursWorked = 0;
        double grossIncome = 0;
        double netIncome = 0;
        double newNet = 0;
        double newNet2 = 0;
        
        System.out.println("Please enter your pay rate");
        payRate = in.nextDouble();
        
        System.out.println("\nPlease enter how many hours you worked");
        hoursWorked = in.nextDouble();
        
        //Calculate personal information
        grossIncome = payRate * hoursWorked;
        netIncome = grossIncome - (grossIncome * incomeTax);
        clothes = netIncome * clothes;
        newNet = netIncome - clothes;
        supplies = newNet * supplies;
        newNet2 = netIncome - supplies;
        myBonds = newNet2 * myBonds;
        parentsBonds = myBonds * parentsBonds;
        
        //Display to the user information regarding their personal expenses and pay information
        System.out.println("\nYour gross income is: " + twoDecimal.format(grossIncome));
        System.out.println("Your net income after taxes is: " + twoDecimal.format(netIncome));
        System.out.println("You spent $" + twoDecimal.format(clothes) + " on clothes and other accessories.");
        System.out.println("You spent $" + twoDecimal.format(supplies) + " on school supplies.");
        System.out.println("You spent $" + twoDecimal.format(myBonds) + " to buy savings bonds.");
        System.out.println("Your parents spent $" + (int)parentsBonds + " to buy additional savings bonds for you.");//used a type cast to remove the decimal as per the requirement       
    }//End of main    
}//End of program
