import java.util.*;
class Perfectno{
	public static void main(String[] args) {
		int a,sum=0;
    Scanner sc =new Scanner(System.in);
		System.out.print("enter the number");
		 a = sc.nextInt();
		for( int i=1;i<=a;i++){
			if(a%i== 0){
				sum=sum+i;
			}
		}
		if(a==sum){
			System.out.println("perfect no");
		}
		else{
			System.out.println("not a perfect no");
		}
	}
}