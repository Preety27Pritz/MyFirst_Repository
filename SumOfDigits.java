import java.util.Scanner;
class SumOfDigits
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();

		System.out.println(sum(n));
	}
	
	static int sum(int n)
	{
		if(n<=9) return n;
		
		return (n%10)+sum(n/10);	
	}
}