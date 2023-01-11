package Day2Practice;
import java.util.*;
public class MonthName {
	static  Scanner src=new Scanner(System.in);
	public static void main(String[] args) {
		int month=src.nextInt();
		
		switch (month){
		case 11:
			System.out.println("nov");
			break;
		case 12:
			System.out.println("dec");
			break;
			
		case 1:
			System.out.println("Jan");
			break;
			
		case 2:
			System.out.println("feb");
			break;
		case 3:
			System.out.println("mar");
			break;
		case 4:
			System.out.println("apr");
			break;
		case 5:
			System.out.println("mey");
			break;
		case 6:
			System.out.println("june");
			break;
		case 7:
			System.out.println("jul");
			break;
		case 8:
			System.out.println("aug");
			break;
		case 9:
			System.out.println("sep");
			break;
		case 10:
			System.out.println("oct");
			break;
		default :
			System.out.println("Wrong month Number given");
		}

	}

}
