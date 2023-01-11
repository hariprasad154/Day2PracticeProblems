package Day2Practice;

import java.util.Scanner;

public class SumOfNaturalUsing_While {

	public static void main(String[] args) {
		Scanner src =new Scanner(System.in);
		System.out.println("enter the number");
		int num=src.nextInt();
		
		int sum=0;
		int i=0;
		while(i<= num ) {
		
			
			sum=sum+i;
			i++;
						
		}
		System.out.println("the sum of all numbers is " +sum);
		
	}

}
