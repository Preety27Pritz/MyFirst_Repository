import java.util.Scanner;
class Fibo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digit:");
		int i=sc.nextInt();

		System.out.println(fib(n));
	}
	
	static int fib(int n)
	{
		if(i==1) return 0;
		if(i==2) return 1;
		
		return fib(i-1)+fib(i-2);	
	}
}