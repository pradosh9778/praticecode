	
import java.util.Scanner;
 class Number4 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the number of rows ");
int rows = scanner. nextInt();
System.out.println("Printing Pattern");
for (int i = 1; i <= rows; i++)
{
for (int j = rows; j > i; j--)
{
System.out.print(" ");
}
for (int k = 1; k <= i; k++)
{
System.out.print(k + " ");
}
System.out.println();
}
}
}