package Day2Practice;

public class ReverseOfNumb {

	public static void main(String[] args) {
		int num=231;
		int rem=0 , reverse=0;
		
		while (num!=0) {
			rem=num%10;
			reverse=reverse *10 +rem;
			num=num/10;
		}
		System.out.println(reverse);
			}

}
