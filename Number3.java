import java.util.Scanner;
class Number3{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
System.out.println("Enter the number of rows");
int rows = scanner.nextInt();
System.out.println("Printing Pattern");
for (int i = 1; i <= rows; i++)
	{
for (int j = 1; j <= i; j++)
{
System.out.print(j + " ");
}
System.out.println();
}
for (int i = rows; i >= 1; i--)
{
for (int j = 1; j < i; j++)
{
	System.out.print(j + " ");
}
System.out.println();
}
}
}