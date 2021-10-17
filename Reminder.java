  import java.util.Scanner;

class Reminder {
    public static void main(String args[]) {

        int a,b=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers:");
        a = sc.nextInt();
        b = sc.nextInt();

        while(a >= b){
            a = a - b;
        }

        System.out.println("Remainder is:"+a);

    }
}