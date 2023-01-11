package Day2Practice;
import java.util.Scanner;
public class REadNumuber {

	public static void main(String[] args) {
		 
//        Scanner input = new Scanner(System.in);
        int tenth=0;
        int ninth=0;
        int eighth=0;
        
        int thous =0;
        int hundreds = 0;
        int tens = 0;
        int ones = 0;

        //Prompt user to input 3 digit number           
//        System.out.print("Enter a 3 digit number: ");
        int number = 1101001000;

        //Displays hundreds place digit
        hundreds = number / 100;
        System.out.printf("Hundreds place digit: " , hundreds);

        //Displays tens digit
        tens = (number - hundreds) / 10;
        System.out.printf("\nTens place digit: " , tens);


        //Display ones digit
        ones = (number - tens - hundreds);
        System.out.printf("Ones place digit: " , ones);

	}

}
