package Day2Practice;

public class ReverseUsingForLoop {

	public static void main(String[] args) {
		int num=231;
		
		int rem=0 , reverse=0;
		for (;num!=0;num=num/10){
			rem=num%10;
			reverse=reverse *10 +rem;
			
		}
		System.out.println(reverse);
			}
	}


