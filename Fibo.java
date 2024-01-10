import java.util.Scanner;
class Fibo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digit:");
		int n=sc.nextInt();

		System.out.println(fib(n));
	}
	
	static int fib(int n)
	{
		if(n==1) return 0;
		if(n==2) return 1;
		
		return fib(n-1)+fib(n-2);	
	}
}