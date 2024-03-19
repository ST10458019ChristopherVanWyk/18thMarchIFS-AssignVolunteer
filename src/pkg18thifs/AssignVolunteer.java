package pkg18thifs;
import java.util.Scanner;
/**
 * @ChristopherVanWyk ST10458019
 */
public class AssignVolunteer 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        int donationType;
        String volunteer;
        final int CLOTHING_CODE = 1;
        final int OTHER_CODE = 2;
        final String CLOTHING_PRICER = "Regina";
        final String OTHER_PRICER = "Marco";
        
        Scanner input = new Scanner(System.in);
        System.out.println("What type of donation is this?");
        System.out.print("Enter " + CLOTHING_CODE + " for clothing, " + OTHER_CODE + "for nything else...");
        donationType = input.nextInt();
        
        if(donationType == CLOTHING_CODE)
            volunteer = CLOTHING_PRICER;
        else
            volunteer = OTHER_PRICER;
        
        System.out.println("You entered " + donationType);
        System.out.println("The volunteer who will price this item is " + volunteer);
          
    }
    
}
