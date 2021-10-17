import java.util.Scanner;
class EvenoddDemo{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("enter the number");
		int num =sc.nextInt();
		int result= (num/2)*2;
		if( result == num){
			System.out.println(" the number is even");
		}
			else{
				System.out.println(" the num is odd ");
			}
		

	}
}