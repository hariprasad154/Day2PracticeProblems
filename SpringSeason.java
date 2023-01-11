package Day2Practice;
import java.util.Scanner;
public class SpringSeason {
	static Scanner src=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the month");
		int m=src.nextInt();
		System.out.println("Enter the Day");
		int d=src.nextInt();
		if ((m>3||m<6)&&d<30) {
			if ((m==3&&d<20)||(m==6&&d>20)) {
				System.out.println(false);
				
			}else {
				System.out.println(true);
			}
			
			
			
		}else {
			System.out.println(false);
		}
		
			}
	

}
