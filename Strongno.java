import java.util.*;
class Strongno{

	public static void main(String[] args) {
		int num,temp,rem,sum=0,f=1,i;
		System.out.println(" enter any Number");
		Scanner sc = new Scanner(System.in);
		 num = sc.nextInt();
		temp =num;
		while(temp!=0){
			rem =temp%10;
			f=1;
			for(i=1;i<=rem;i++){
				f=f*i;
			}
			sum=sum+f;
			temp=temp/10;
		}
		if(sum==num){
			System.out.println(" strong number");
		}
		else{
			System.out.println(" not a strong number");
		}
	}
}