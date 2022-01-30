/*Adarsh Tailor
1/29/2022
JDK 14.0.2
Money Changer- This program will break change into correct coins
*/
import javax.swing.JOptionPane;
public class MoneyChanger {

    public static void main(String[] args) {
        //Declaring variabel for all the coins
        String answer = JOptionPane.showInputDialog(null,"Enter amount of change");
        int cents = (int)(Double.parseDouble(answer)*100);
        int centsLeft; //Temporary variabel for storin remaining cents 
        int dollars;
        int quarters;
        int dimes;
        int nickels;
        int pennies;
        
        //Setting calculations 
        dollars = cents / 100;
        centsLeft = cents % 100;
        quarters = centsLeft / 25;
        centsLeft = centsLeft % 25;
        dimes = centsLeft / 10;
        centsLeft = centsLeft % 10;
        nickels = centsLeft / 5;
        centsLeft = centsLeft % 5;
        pennies = centsLeft;
        
        //Printing the results 
        JOptionPane.showMessageDialog(null,
           "Total Cents: " + cents
            + "\nDollars: " + dollars
            + "\nQuarters: " + quarters
            + "\nDimes:  " + dimes
            + "\nNickels: " + nickels
            + "\nPennies: " + pennies);
    }    
}
