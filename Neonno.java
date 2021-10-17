
import java.util.*;
class Neonno{
	public static void main(String[] args) {
		int n,sum =0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		n =sc.nextInt();
		int squre =n*n;
		while(squre!=0){
			int digit =squre%10;
			sum =sum+digit;
			squre =squre/10;
		}
		if( n==sum){
			System.out.println("number is neon");
		}
		else{
			System.out.println("number is not neon");
		}
	}
	
}